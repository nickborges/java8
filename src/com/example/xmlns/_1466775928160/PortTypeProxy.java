package com.example.xmlns._1466775928160;

public class PortTypeProxy implements com.example.xmlns._1466775928160.PortType {
  private String _endpoint = null;
  private com.example.xmlns._1466775928160.PortType portType = null;
  
  public PortTypeProxy() {
    _initPortTypeProxy();
  }
  
  public PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortTypeProxy();
  }
  
  private void _initPortTypeProxy() {
    try {
      portType = (new com.example.xmlns._1466775928160.RegistroCobrancaServiceServiceagentLocator()).getRegistroCobrancaEndpoint();
      if (portType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portType != null)
      ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.xmlns._1466775928160.PortType getPortType() {
    if (portType == null)
      _initPortTypeProxy();
    return portType;
  }
  
  public com.tibco.www.schemas.bws_registro_cbr.Recursos.XSD.Schema_xsd.Resposta registroTituloCobranca(com.tibco.www.schemas.bws_registro_cbr.Recursos.XSD.Schema_xsd.Requisicao parameters) throws java.rmi.RemoteException, com.tibco.www.schemas.bws_registro_cbr.Recursos.XSD.Schema_xsd.Erro{
    if (portType == null)
      _initPortTypeProxy();
    return portType.registroTituloCobranca(parameters);
  }
  
  
}