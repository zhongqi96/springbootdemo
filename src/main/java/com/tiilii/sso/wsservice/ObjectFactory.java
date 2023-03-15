
package com.tiilii.sso.wsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tiilii.sso.wsservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SsoCheckUserLoginId_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoCheckUserLoginId");
    private final static QName _SsoNewUserResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoNewUserResponse");
    private final static QName _SsoNewUserLogin_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoNewUserLogin");
    private final static QName _SsoNewUser_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoNewUser");
    private final static QName _SsoSelectUserInfoResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoSelectUserInfoResponse");
    private final static QName _SsoUpdateUserInfo_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoUpdateUserInfo");
    private final static QName _SsoLogin_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoLogin");
    private final static QName _SsoDeleteUserLoginResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoDeleteUserLoginResponse");
    private final static QName _SsoNewUserLoginResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoNewUserLoginResponse");
    private final static QName _SsoSelectUserInfo_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoSelectUserInfo");
    private final static QName _SsoLoginResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoLoginResponse");
    private final static QName _SsoCheckUserLoginIdResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoCheckUserLoginIdResponse");
    private final static QName _SsoDeleteUserLogin_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoDeleteUserLogin");
    private final static QName _SsoUpdateUserInfoResponse_QNAME = new QName("http://wsService.sso.tiilii.com/", "ssoUpdateUserInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tiilii.sso.wsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SsoSelectUserInfoResponse }
     * 
     */
    public SsoSelectUserInfoResponse createSsoSelectUserInfoResponse() {
        return new SsoSelectUserInfoResponse();
    }

    /**
     * Create an instance of {@link SsoUpdateUserInfo }
     * 
     */
    public SsoUpdateUserInfo createSsoUpdateUserInfo() {
        return new SsoUpdateUserInfo();
    }

    /**
     * Create an instance of {@link SsoCheckUserLoginId }
     * 
     */
    public SsoCheckUserLoginId createSsoCheckUserLoginId() {
        return new SsoCheckUserLoginId();
    }

    /**
     * Create an instance of {@link SsoNewUserResponse }
     * 
     */
    public SsoNewUserResponse createSsoNewUserResponse() {
        return new SsoNewUserResponse();
    }

    /**
     * Create an instance of {@link SsoNewUserLogin }
     * 
     */
    public SsoNewUserLogin createSsoNewUserLogin() {
        return new SsoNewUserLogin();
    }

    /**
     * Create an instance of {@link SsoNewUser }
     * 
     */
    public SsoNewUser createSsoNewUser() {
        return new SsoNewUser();
    }

    /**
     * Create an instance of {@link SsoLoginResponse }
     * 
     */
    public SsoLoginResponse createSsoLoginResponse() {
        return new SsoLoginResponse();
    }

    /**
     * Create an instance of {@link SsoCheckUserLoginIdResponse }
     * 
     */
    public SsoCheckUserLoginIdResponse createSsoCheckUserLoginIdResponse() {
        return new SsoCheckUserLoginIdResponse();
    }

    /**
     * Create an instance of {@link SsoDeleteUserLogin }
     * 
     */
    public SsoDeleteUserLogin createSsoDeleteUserLogin() {
        return new SsoDeleteUserLogin();
    }

    /**
     * Create an instance of {@link SsoUpdateUserInfoResponse }
     * 
     */
    public SsoUpdateUserInfoResponse createSsoUpdateUserInfoResponse() {
        return new SsoUpdateUserInfoResponse();
    }

    /**
     * Create an instance of {@link SsoLogin }
     * 
     */
    public SsoLogin createSsoLogin() {
        return new SsoLogin();
    }

    /**
     * Create an instance of {@link SsoDeleteUserLoginResponse }
     * 
     */
    public SsoDeleteUserLoginResponse createSsoDeleteUserLoginResponse() {
        return new SsoDeleteUserLoginResponse();
    }

    /**
     * Create an instance of {@link SsoNewUserLoginResponse }
     * 
     */
    public SsoNewUserLoginResponse createSsoNewUserLoginResponse() {
        return new SsoNewUserLoginResponse();
    }

    /**
     * Create an instance of {@link SsoSelectUserInfo }
     * 
     */
    public SsoSelectUserInfo createSsoSelectUserInfo() {
        return new SsoSelectUserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoCheckUserLoginId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoCheckUserLoginId")
    public JAXBElement<SsoCheckUserLoginId> createSsoCheckUserLoginId(SsoCheckUserLoginId value) {
        return new JAXBElement<SsoCheckUserLoginId>(_SsoCheckUserLoginId_QNAME, SsoCheckUserLoginId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoNewUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoNewUserResponse")
    public JAXBElement<SsoNewUserResponse> createSsoNewUserResponse(SsoNewUserResponse value) {
        return new JAXBElement<SsoNewUserResponse>(_SsoNewUserResponse_QNAME, SsoNewUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoNewUserLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoNewUserLogin")
    public JAXBElement<SsoNewUserLogin> createSsoNewUserLogin(SsoNewUserLogin value) {
        return new JAXBElement<SsoNewUserLogin>(_SsoNewUserLogin_QNAME, SsoNewUserLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoNewUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoNewUser")
    public JAXBElement<SsoNewUser> createSsoNewUser(SsoNewUser value) {
        return new JAXBElement<SsoNewUser>(_SsoNewUser_QNAME, SsoNewUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoSelectUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoSelectUserInfoResponse")
    public JAXBElement<SsoSelectUserInfoResponse> createSsoSelectUserInfoResponse(SsoSelectUserInfoResponse value) {
        return new JAXBElement<SsoSelectUserInfoResponse>(_SsoSelectUserInfoResponse_QNAME, SsoSelectUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUpdateUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoUpdateUserInfo")
    public JAXBElement<SsoUpdateUserInfo> createSsoUpdateUserInfo(SsoUpdateUserInfo value) {
        return new JAXBElement<SsoUpdateUserInfo>(_SsoUpdateUserInfo_QNAME, SsoUpdateUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoLogin")
    public JAXBElement<SsoLogin> createSsoLogin(SsoLogin value) {
        return new JAXBElement<SsoLogin>(_SsoLogin_QNAME, SsoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoDeleteUserLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoDeleteUserLoginResponse")
    public JAXBElement<SsoDeleteUserLoginResponse> createSsoDeleteUserLoginResponse(SsoDeleteUserLoginResponse value) {
        return new JAXBElement<SsoDeleteUserLoginResponse>(_SsoDeleteUserLoginResponse_QNAME, SsoDeleteUserLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoNewUserLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoNewUserLoginResponse")
    public JAXBElement<SsoNewUserLoginResponse> createSsoNewUserLoginResponse(SsoNewUserLoginResponse value) {
        return new JAXBElement<SsoNewUserLoginResponse>(_SsoNewUserLoginResponse_QNAME, SsoNewUserLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoSelectUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoSelectUserInfo")
    public JAXBElement<SsoSelectUserInfo> createSsoSelectUserInfo(SsoSelectUserInfo value) {
        return new JAXBElement<SsoSelectUserInfo>(_SsoSelectUserInfo_QNAME, SsoSelectUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoLoginResponse")
    public JAXBElement<SsoLoginResponse> createSsoLoginResponse(SsoLoginResponse value) {
        return new JAXBElement<SsoLoginResponse>(_SsoLoginResponse_QNAME, SsoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoCheckUserLoginIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoCheckUserLoginIdResponse")
    public JAXBElement<SsoCheckUserLoginIdResponse> createSsoCheckUserLoginIdResponse(SsoCheckUserLoginIdResponse value) {
        return new JAXBElement<SsoCheckUserLoginIdResponse>(_SsoCheckUserLoginIdResponse_QNAME, SsoCheckUserLoginIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoDeleteUserLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoDeleteUserLogin")
    public JAXBElement<SsoDeleteUserLogin> createSsoDeleteUserLogin(SsoDeleteUserLogin value) {
        return new JAXBElement<SsoDeleteUserLogin>(_SsoDeleteUserLogin_QNAME, SsoDeleteUserLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUpdateUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsService.sso.tiilii.com/", name = "ssoUpdateUserInfoResponse")
    public JAXBElement<SsoUpdateUserInfoResponse> createSsoUpdateUserInfoResponse(SsoUpdateUserInfoResponse value) {
        return new JAXBElement<SsoUpdateUserInfoResponse>(_SsoUpdateUserInfoResponse_QNAME, SsoUpdateUserInfoResponse.class, null, value);
    }

}
