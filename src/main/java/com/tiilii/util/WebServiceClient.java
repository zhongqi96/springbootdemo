package com.tiilii.util;

import org.apache.log4j.Logger;

import com.tiilii.fs.ws.FSServiceImplService;
import com.tiilii.fs.ws.IFSService;
import com.tiilii.message.service.soap.IMessageService;
import com.tiilii.message.service.soap.MessageServiceService;
import com.tiilii.resource.service.soap.IResourceService;
import com.tiilii.resource.service.soap.ResourceServiceService;
import com.tiilii.sso.wsservice.ISSOService;
import com.tiilii.sso.wsservice.SSOServiceImplService;

/**
 * 
 * @ClassName: WebServiceClient
 * @Description: WebService 服务客户端
 * @author hunter
 * @date 2019年9月23日 上午11:14:07
 *
 */
public class WebServiceClient {
	private static Logger logger = Logger.getLogger(WebServiceClient.class);
	// fs 服务
	private static IFSService iFSService;
	// resource 服务
	private static IResourceService iResourceService;
	// message 服务
	private static IMessageService iMessageService;
	// sso 服务
	private static ISSOService iSsoService;

	/**
	 * 服务启动初始化
	 */
	public static void start() {
		try {
			new Thread() {
				public void run() {
					try {
						getIFSService();
						getIResourceService();
						getIMessageService();
						getISSOService();
					} catch (Exception e) {

					}
				}
			}.start();
		} catch (Exception e) {
			logger.error("connect fs failed:" + e.toString());
		}
	}

	/**
	 * fs客户端 单例实现
	 *
	 * @return
	 * @return IFSService 返回类型
	 * @author herb
	 * @date 2017年10月30日 下午4:04:59
	 */
	public static IFSService getIFSService() {
		if (iFSService == null) {
			try {
				iFSService = new FSServiceImplService().getFSServiceImplPort();
				logger.info("--------------fs webService client start succeed!---------");
				return iFSService;
			} catch (Exception e) {
				logger.error("--------------fs webService client start failed!---------");
				logger.error("--------------error:" + e);
				iFSService = null;
				e.printStackTrace();
				return null;
			}
		} else {
			return iFSService;
		}
	}

	public static IResourceService getIResourceService() {
		if (iResourceService == null) {
			try {
				iResourceService = new ResourceServiceService().getResourceServicePort();
				logger.info("--------------resource webService client start succeed!---------");
				return iResourceService;
			} catch (Exception e) {
				logger.error("--------------resource webService client start failed!---------");
				logger.error("--------------error:" + e);
				iFSService = null;
				e.printStackTrace();
				return null;
			}
		} else {
			return iResourceService;
		}
	}

	public static IMessageService getIMessageService() {
		if (iMessageService == null) {
			try {
				iMessageService = new MessageServiceService().getMessageServicePort();
				logger.info("--------------message webService client start succeed!---------");
				return iMessageService;
			} catch (Exception e) {
				logger.error("--------------message webService client start failed!---------");
				logger.error("--------------error:" + e);
				iFSService = null;
				e.printStackTrace();
				return null;
			}
		} else {
			return iMessageService;
		}
	}

	public static ISSOService getISSOService() {
		if (iSsoService == null) {
			try {
				iSsoService = new SSOServiceImplService().getSSOServiceImplPort();
				logger.info("--------------sso webService client start succeed!---------");
				return iSsoService;
			} catch (Exception e) {
				logger.error("--------------sso webService client start failed!---------");
				logger.error("--------------error:" + e);
				iSsoService = null;
				e.printStackTrace();
				return null;
			}
		} else {
			return iSsoService;
		}
	}

}
