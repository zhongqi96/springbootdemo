package com.tiilii.alldim.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiilii.alldim.dao.dim.dimArea.DimAreaDao;
import com.tiilii.alldim.dao.dim.dimBlood.DimBloodDao;
import com.tiilii.alldim.dao.dim.dimCertificateType.DimCertificateTypeDao;
import com.tiilii.alldim.dao.dim.dimCourse.DimCourseDao;
import com.tiilii.alldim.dao.dim.dimCourseTopicType.DimCourseTopicTypeDao;
import com.tiilii.alldim.dao.dim.dimEduLevel.DimEduLevelDao;
import com.tiilii.alldim.dao.dim.dimHealth.DimHealthDao;
import com.tiilii.alldim.dao.dim.dimKnowitem.DimKnowitemDao;
import com.tiilii.alldim.dao.dim.dimMobileType.DimMobileTypeDao;
import com.tiilii.alldim.dao.dim.dimNation.DimNationDao;
import com.tiilii.alldim.dao.dim.dimNationality.DimNationalityDao;
import com.tiilii.alldim.dao.dim.dimNode.DimNodeDao;
import com.tiilii.alldim.dao.dim.dimPath.DimPathDao;
import com.tiilii.alldim.dao.dim.dimResourceTagType.DimResourceTagTypeDao;
import com.tiilii.alldim.dao.dim.dimSchoolRecord.DimSchoolRecordDao;
import com.tiilii.alldim.dao.dim.dimSex.DimSexDao;
import com.tiilii.alldim.dao.dim.dimTerm.DimTermDao;
import com.tiilii.alldim.dao.dim.dimTopicType.DimTopicTypeDao;
import com.tiilii.alldim.model.dim.dimArea.DimArea;
import com.tiilii.alldim.model.dim.dimBlood.DimBlood;
import com.tiilii.alldim.model.dim.dimCertificateType.DimCertificateType;
import com.tiilii.alldim.model.dim.dimCourse.DimCourse;
import com.tiilii.alldim.model.dim.dimCourseTopicType.DimCourseTopicType;
import com.tiilii.alldim.model.dim.dimEduLevel.DimEduLevel;
import com.tiilii.alldim.model.dim.dimHealth.DimHealth;
import com.tiilii.alldim.model.dim.dimKnowitem.DimKnowitem;
import com.tiilii.alldim.model.dim.dimMobileType.DimMobileType;
import com.tiilii.alldim.model.dim.dimNation.DimNation;
import com.tiilii.alldim.model.dim.dimNationality.DimNationality;
import com.tiilii.alldim.model.dim.dimNode.DimNode;
import com.tiilii.alldim.model.dim.dimPath.DimPath;
import com.tiilii.alldim.model.dim.dimResourceTagType.DimResourceTagType;
import com.tiilii.alldim.model.dim.dimSchoolRecord.DimSchoolRecord;
import com.tiilii.alldim.model.dim.dimSex.DimSex;
import com.tiilii.alldim.model.dim.dimTerm.DimTerm;
import com.tiilii.alldim.model.dim.dimTopicType.DimTopicType;
import com.tiilii.framework.core.exception.SystemException;
import com.tiilii.framework.core.page.Page;

@Service
public class AllDimService {
	@Autowired
	private DimPathDao dimPathDao;
	@Autowired
	private DimNodeDao dimNodeDao;
	@Autowired
	private DimTermDao dimTermDao;
	@Autowired
	private DimCourseDao dimCourseDao;
	@Autowired
	private DimKnowitemDao dimKnowitemDao;
	@Autowired
	private DimCertificateTypeDao dimCertificateTypeDao;
	@Autowired
	private DimBloodDao dimBloodDao;
	@Autowired
	private DimSexDao dimSexDao;
	@Autowired
	private DimNationDao dimNationDao;
	@Autowired
	private DimSchoolRecordDao dimSchoolRecordDao;
	@Autowired
	private DimEduLevelDao dimEduLevelDao;
	@Autowired
	private DimHealthDao dimHealthDao;
	@Autowired
	private DimMobileTypeDao dimMobileTypeDao;
	@Autowired
	private DimAreaDao dimAreaDao;
	@Autowired
	private DimNationalityDao dimNationalityDao;
	@Autowired
	private DimResourceTagTypeDao dimResourceTagTypeDao;
	@Autowired
	private DimTopicTypeDao dimTopicTypeDao;
	@Autowired
	private DimCourseTopicTypeDao dimCourseTopicTypeDao;

	/**
	 * 血液
	 * 
	 * @return
	 * @throws SystemException
	 */
	public List<DimBlood> findDimBlood() throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		return dimBloodDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	/**
	 * 性别
	 * 
	 * @author jerry
	 * @Date 2015-12-30 15:19
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<DimSex> findDimSex() throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		return dimSexDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	/**
	 * 国籍
	 * 
	 * @return
	 * @throws SystemException
	 */
	public List<DimNation> findDimNation() throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		return dimNationDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	/**
	 * 学位
	 * 
	 * @author jerry
	 * @Date 2015-12-30 15:19
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<DimSchoolRecord> findDimSchoolRecord(int degree, String parentUid) throws SystemException {
		List<DimSchoolRecord> dimSchoolRecordList = new ArrayList<DimSchoolRecord>();
		DimSchoolRecord dimSchoolRecord = new DimSchoolRecord();
		dimSchoolRecord.setSchoolRecordId("");
		dimSchoolRecord.setSchoolRecordName("");
		dimSchoolRecordList.add(dimSchoolRecord);
		Map<String, Object> filter = new HashMap<String, Object>();
		if (degree != 0) {
			filter.put(DimSchoolRecord.FIELD_DEGREE, degree);
		}
		if (parentUid != null && !parentUid.equals("")) {
			filter.put(DimSchoolRecord.FIELD_PARENTID, parentUid);
		}
		dimSchoolRecordList.addAll(dimSchoolRecordDao.findByFields(filter, false, null, 0, 0).getResults());
		return dimSchoolRecordList;
	}

	/**
	 * 受教育程度
	 * 
	 * @author jerry
	 * @Date 2015-12-30 15:19
	 * 
	 * @param parentId
	 *            父节点
	 * @param degree
	 * @return
	 * @throws SystemException
	 */
	public List<DimEduLevel> findDimEduLevel(int degree, String parentUid) throws SystemException {
		List<DimEduLevel> dimEduLevelList = new ArrayList<DimEduLevel>();
		Map<String, Object> filter = new HashMap<String, Object>();
		if (degree != 0) {
			filter.put(DimEduLevel.FIELD_DEGREE, degree);
		}
		if (parentUid != null && !parentUid.equals("")) {
			filter.put(DimEduLevel.FIELD_PARENTID, parentUid);
		} else {
			DimEduLevel dimEduLevel = new DimEduLevel();
			dimEduLevel.setEduLevelId("");
			dimEduLevel.setEduLevelName("请选择");
			dimEduLevelList.add(dimEduLevel);
		}
		dimEduLevelList.addAll(dimEduLevelDao.findByFields(filter, false, null, 0, 0).getResults());
		return dimEduLevelList;
	}

	/**
	 * 健康程度
	 * 
	 * @author jerry
	 * @Date 2015-12-30 15:19
	 * 
	 * @param parentId
	 *            父节点
	 * @param degree
	 * @return
	 * @throws SystemException
	 */
	public List<DimHealth> findDimHealth(int degree, String parentUid) throws SystemException {
		List<DimHealth> dimHealthList = new ArrayList<DimHealth>();
		DimHealth dimHealth = new DimHealth();
		dimHealth.setHealthId("");
		dimHealth.setHealthName("");
		dimHealthList.add(dimHealth);
		Map<String, Object> filter = new HashMap<String, Object>();
		if (degree != 0) {
			filter.put(DimHealth.FIELD_DEGREE, degree);
		}
		if (parentUid != null && !parentUid.equals("")) {
			filter.put(DimHealth.FIELD_PARENTID, parentUid);
		}
		dimHealthList.addAll(dimHealthDao.findByFields(filter, false, null, 0, 0).getResults());
		return dimHealthList;
	}

	/**
	 * 手机类型列表
	 * 
	 * @author hunter
	 * @date 2018-4-25
	 * @return
	 * @throws SystemException
	 */
	public List<DimMobileType> findDimMobileType() throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		return dimMobileTypeDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	/**
	 * 通过父节点查找行政区划
	 * 
	 * @author jerry
	 * @Date 2015-12-30 15:19
	 * 
	 * @param parentId
	 *            父节点
	 * @param degree
	 * @return
	 * @throws SystemException
	 */
	public List<DimArea> findDimArea(String parentId, int degree) throws SystemException {
		List<DimArea> dimAreaList = new ArrayList<DimArea>();
		Map<String, Object> filter = new HashMap<String, Object>();
		if (parentId != null && !parentId.equals("")) {
			filter.put(DimArea.FIELD_PARENTID, parentId);
		} else {
			DimArea dimArea = new DimArea();
			dimArea.setAreaId("");
			dimArea.setAreaName("请选择");
			dimAreaList.add(dimArea);
		}
		if (degree != 0) {
			filter.put(DimArea.FIELD_DEGREE, degree);
		}
		dimAreaList.addAll(dimAreaDao.findByFields(filter, false, null, 0, 0).getResults());
		return dimAreaList;
	}

	/**
	 * 民族
	 * 
	 * @author hunter
	 * @date 2018-4-25
	 * @return
	 * @throws SystemException
	 */
	public List<DimNationality> findDimNationality() throws SystemException {
		List<DimNationality> dimNationalityList = new ArrayList<DimNationality>();
		DimNationality dimNationality = new DimNationality();
		dimNationality.setNationalityId("");
		dimNationality.setNationalityName("请选择");
		dimNationalityList.add(dimNationality);
		Map<String, Object> filter = new HashMap<String, Object>();
		dimNationalityList.addAll(dimNationalityDao.findByFields(filter, false, null, 0, 0).getResults());
		return dimNationalityList;
	}

	public DimPath getDimPathById(String pathId) throws SystemException {
		return dimPathDao.get(pathId);
	}

	public DimCourse getDimCourseById(String courseId) throws SystemException {
		return dimCourseDao.get(courseId);
	}

	public List<DimPath> findDimPath(int degree) throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put(DimPath.FIELD_DEGREE, degree);
		return findDimPath(filter);
	}

	public List<DimPath> findDimPath(Map<String, Object> filter) throws SystemException {
		return dimPathDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	public List<DimCourse> findDimCourse(int degree) throws SystemException {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put(DimCourse.FIELD_DEGREE, degree);
		return findDimCourse(filter);
	}

	public List<DimCourse> findDimCourse(Map<String, Object> filter) throws SystemException {
		return dimCourseDao.findByFields(filter, false, null, 0, 0).getResults();
	}

	/**
	 * (AllDim) 主键获取DimKnowitem
	 * 
	 * @param knowitemId
	 * @return
	 * @throws SystemException
	 */
	public DimKnowitem getDimKnowitemById(String knowitemId) throws SystemException {
		return dimKnowitemDao.get(knowitemId);
	}
	
	/**
	 * (AllDim) 根据knowitem_name获取DimKnowitem
	 * 
	 * @param knowitemId
	 * @return
	 * @throws SystemException
	 */
	public DimKnowitem findKnowitemByKnowitemName(String knowitemName) throws SystemException {
		String sql = " select * from d_knowitem where knowitem_name = ?";
		List<Object> params = new ArrayList<Object>();
		if (knowitemName != null && !"".equals(knowitemName)) {
			params.add(knowitemName);
		}
		List<DimKnowitem> list = dimKnowitemDao.findBySql(sql, 0, 0, params.toArray()).getResult();
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	/**
	 * (AllDim) 主键获取DimTopicType
	 * 
	 * @param knowitemId
	 * @return
	 * @throws SystemException
	 */
	public DimTopicType getDimTopicTypeById(String topicTypeId) throws SystemException {
		return dimTopicTypeDao.get(topicTypeId);
	}

	/**
	 * (AllDim) 根据题型名称获取DimTopicType
	 * 
	 * @param knowitemId
	 * @return
	 * @throws SystemException
	 */
	public DimTopicType getDimTopicTypeByName(String name) throws SystemException {
		return dimTopicTypeDao
				.findBySql("select * from d_topic_type where topic_type_name = '" + name + "'", 0, 0).getResults()
				.get(0);
	}

	/**
	 * (AllDim) 根据courseId查找题型
	 * 
	 * @author hunter
	 * @date 2018-5-28
	 * @param courseId
	 * @return
	 * @throws SystemException
	 */
	public List<DimTopicType> selectTopicTypes(String courseId) throws SystemException {
		String sql = " select b.* from d_course_topic_type a, d_topic_type b where a.topic_type_id = b.topic_type_id ";
		List<Object> params = new ArrayList<Object>();
		if (courseId != null && !"".equals(courseId)) {
			sql += " and a.course_id = ?";
			params.add(courseId);
		}
		sql += " and b.topic_type_id != '31'";  // 过滤掉客观填空题
		sql += " order by b.disp_index_1 asc";
		return dimTopicTypeDao.findBySql(sql, 0, 0, params.toArray()).getResults();
	}

	/**
	 * (AllDim)根据certificateTypeId 查询父证书类型
	 * 
	 * @author hunter
	 * @date 2018-4-19
	 * @param certificateTypeId
	 * @return
	 * @throws SystemException
	 */
	public DimCertificateType findParentDimCertificateTypeById(String certificateTypeId) throws SystemException {
		// 首先拿到对象
		DimCertificateType type = dimCertificateTypeDao.get(certificateTypeId);
		// 返回父证书类型
		return dimCertificateTypeDao.get(type.getParentId());
	}

	/**
	 * (AllDim) 主键获取证书类型
	 * 
	 * @author hunter
	 * @date 2018-4-19
	 * @param certificateTypeId
	 * @return
	 * @throws SystemException
	 */
	public DimCertificateType findDimCertificateTypeById(String certificateTypeId) throws SystemException {
		return dimCertificateTypeDao.get(certificateTypeId);
	}

	/**
	 * 根据resource_tag_type_id， 查询标记类型
	 * 
	 * @param value
	 * @return
	 * @throws SystemException
	 */
	public List<DimResourceTagType> listResourceTagTypeBy(String value) throws SystemException {
		// String sql = " select * from d_resource_tag_type where
		// resource_tag_type_id like '%" + value + "%'";
		String sql = " select * from d_resource_tag_type where resource_tag_type_id like '%Z%' or resource_tag_type_id like '%T%'";
		List<DimResourceTagType> list = dimResourceTagTypeDao.findBySql(sql, 0, 0).getResults();
		return list;
	}

	public DimEduLevel getDimEduLevel(String eduLevelId) throws SystemException {
		return dimEduLevelDao.get(eduLevelId);
	}

	public DimHealth getDimHealth(String healthId) throws SystemException {
		return dimHealthDao.get(healthId);
	}

	/**
	 * 得到树节点（基点或者节点）的描述信息。<br>
	 * 查询知识点的描述
	 * 
	 * @author hunter
	 * @Date 2018-4-26
	 * @param treeId
	 *            树id, 知识点Id
	 * 
	 * @return
	 * @throws SystemException
	 */
	public Page<Map<String, Object>> queryKnowitemDesc(String treeId) throws SystemException {
		List<Object> params = new ArrayList<Object>();
		String sql = "";
		if (treeId != null && treeId.length() > 0) {
			params.add(treeId);
			sql = "SELECT knowitem_desc AS description FROM d_knowitem WHERE knowitem_id = ? ";
		}
		return dimKnowitemDao.findBySqlInMap(sql, 0, 0, params.toArray());
	}

	/**
	 * 查询所有证书类型
	 * 
	 * @author hunter
	 * @date 2018-5-2
	 * @return
	 * @throws SystemException
	 */
	public List<DimCertificateType> listAllDimCertificateType() throws SystemException {
		return dimCertificateTypeDao.listAll(0, 0).getResults();
	}

	/**
	 * 根据条件查询allDim的d_knowitems
	 * 
	 * @author hunter
	 * @date 2018-05-15
	 * @param knowitemIds
	 * @param courseId
	 * @param pathId
	 * @param keyword
	 * @param pageSize
	 * @param pageNum
	 * @return
	 * @throws SystemException
	 */
	public Page<DimKnowitem> selectDimKnowitems(String knowitemIds, String courseId, String pathId, String keyword, int pageSize,
			int pageNum) throws SystemException {
		String sql = " select * from d_knowitem where 1 = 1";
		if(pathId != null && !"".equals(pathId)){
			DimPath path = getDimPathById(pathId);
			if ("1".equals(path.getIsFullGrade())) {
				sql = " and course_id = " + courseId + " and path_id = " + pathId;
			} else {
				sql = " and course_id = " + courseId + " and path_id = " + path.getParentId();
			}
		}

		if (knowitemIds != null && !"".equals(knowitemIds)) {
			sql += " and knowitem_id in (" + knowitemIds + ")";
		}
		
		if (keyword != null && !"".equals(keyword)) {
			sql += " and (knowitem_name like '%" + keyword + "%'  or knowitem_keyword like '%" + keyword + "%') ";
		}

		return dimKnowitemDao.findBySql(sql, pageSize, pageNum);
	}
	
	/**
	 * 
	 * @Title: selectKnowitemsForMap
	 * @Description: 查找d_knowitem 的Map
	 * @param @param pathId
	 * @param @param courseId
	 * @param @return
	 * @param @throws SystemException    参数
	 * @return List<Map<String,Object>>    返回类型
	 * @author hunter
	 * @date 2018年9月11日
	 */
	public List<Map<String, Object>> selectKnowitemsForMap(String pathId, String courseId) throws SystemException {
		String sql = " select knowitem_id, knowitem_name from d_knowitem where path_id = ? and course_id = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(pathId);
		params.add(courseId);
		Page<Map<String,Object>> page = dimKnowitemDao.findBySqlInMap(sql, 0, 0, params.toArray());
		List<Map<String, Object>> list = page.getResults();
		/*List<Map<String, Object>> nodeList = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : list) {
			String targetId = (String) map.get("knowitem_id");
			String name = (String) map.get("knowitem_name");
			Map<String, Object> newMap = new HashMap<String, Object>();
			newMap.put("target_id", targetId);
			newMap.put("name", name);
			nodeList.add(newMap);
		}*/
		return list;
	}
	
	/**
	 * 
	 * @Title: getKnowitemPresubList
	 * @Description: 获得知识点的前去或者后继  1， 代表前去；-1代表后继
	 * @param @param knowitemId
	 * @param @param type
	 * @param @return
	 * @param @throws SystemException    参数
	 * @return List<Map<String,Object>>    返回类型
	 * @author hunter
	 * @date 2018年9月11日
	 */
	public List<Map<String, Object>> getKnowitemPresubList(String knowitemId, int type) throws SystemException {
		String sql = "";
		if (type == 1) {
			// 查询前驱
			sql = "select kp.presub_knowitem_id,kp.knowitem_id from d_knowitem_presub kp where kp.knowitem_id=?";
		} else {
			// 查询后继
			sql = "select kp.presub_knowitem_id,kp.knowitem_id from d_knowitem_presub kp where kp.presub_knowitem_id=?";
		}
		List<Map<String, Object>> list = dimKnowitemDao.findBySqlInMap(sql, 0, 0, knowitemId).getResult();
		return list;
	}

	/**
	 * 查找上下学期列表
	 * 
	 * @author hunter
	 * @date 2018-5-24
	 * @return
	 * @throws SystemException
	 */
	public List<DimTerm> listAllDimTerm() throws SystemException {
		return dimTermDao.listAll(0, 0).getResults();
	}

	/**
	 * 主键查询d_node
	 * 
	 * @author hunter
	 * @date 2018-6-15
	 * @param nodeId
	 * @return
	 * @throws SystemException
	 */
	public DimNode getDimNodeById(String nodeId) throws SystemException {
		return dimNodeDao.get(nodeId);
	}

	/**
	 * 根据nodeId 查询所有子节点
	 * 
	 * @author hunter
	 * @date 2018-6-25
	 * @param nodeId
	 * @return 节点本身以及所有子节点
	 */
	public String selectSubNodeByNodeId(String nodeId) {
		String subNodeIds = dimNodeDao.getTemplate().queryForObject("select get_subnode_in_d_node(" + nodeId + ")",
				String.class);
		if (subNodeIds != null && !"".equals(subNodeIds)) {
			return nodeId + "," + subNodeIds.replace("@", ",");
		}
		return nodeId;
	}

	/**
	 * 根据pathId, courseId, degree 来查找node
	 * 
	 * @author hunter
	 * @date 2018-6-28
	 * @param pathId
	 * @param courseId
	 * @param degree
	 * @return
	 * @throws SystemException
	 */
	public List<DimNode> selectNodes(String pathId, String courseId, int degree) throws SystemException {
		String sql = " select * from d_node where courseId = '" + courseId + "'path_id = '" + pathId + "' and degree = "
				+ (degree + 1);
		return dimNodeDao.findBySql(sql, 0, 0).getResults();
	}

	/**
	 * 根据nodeId, degree 查询直接子节点
	 * 
	 * @author hunter
	 * @date 2018-6-28
	 * @param nodeId
	 * @param degree
	 * @return
	 * @throws SystemException
	 */
	public List<DimNode> selectSubNodes(String nodeId, int degree) throws SystemException {
		String sql = " select * from d_node where parent_id = '" + nodeId + "' and degree = " + (degree + 1);
		return dimNodeDao.findBySql(sql, 0, 0).getResults();
	}

	/**
	 * 
	 * @Title: getCourseTopicType
	 * @Description: 获取DimCourseTopicType
	 * @param courseId
	 * @param topicTypeId
	 * @return
	 * @throws SystemException    参数
	 * @return DimCourseTopicType    返回类型
	 * @author hunter
	 * @date 2019年5月5日
	 */
	public DimCourseTopicType getCourseTopicType(String courseId, String topicTypeId) throws SystemException{
		String sql = " select * from d_course_topic_type where course_id = '" 
				+ courseId + "' and topic_type_id = '" + topicTypeId + "'";
		List<DimCourseTopicType> list = dimCourseTopicTypeDao.findBySql(sql, 0, 0).getResults();
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
}
