/**
 * RegistroCobrancaServiceServiceagentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1466775928160;

public class RegistroCobrancaServiceServiceagentLocator extends org.apache.axis.client.Service implements com.example.xmlns._1466775928160.RegistroCobrancaServiceServiceagent {

    public RegistroCobrancaServiceServiceagentLocator() {
    }


    public RegistroCobrancaServiceServiceagentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegistroCobrancaServiceServiceagentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RegistroCobrancaEndpoint
    private java.lang.String RegistroCobrancaEndpoint_address = "https://cobranca.homologa.bb.com.br:7101/registrarBoleto";

    public java.lang.String getRegistroCobrancaEndpointAddress() {
        return RegistroCobrancaEndpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegistroCobrancaEndpointWSDDServiceName = "RegistroCobrancaEndpoint";

    public java.lang.String getRegistroCobrancaEndpointWSDDServiceName() {
        return RegistroCobrancaEndpointWSDDServiceName;
    }

    public void setRegistroCobrancaEndpointWSDDServiceName(java.lang.String name) {
        RegistroCobrancaEndpointWSDDServiceName = name;
    }

    public com.example.xmlns._1466775928160.PortType getRegistroCobrancaEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RegistroCobrancaEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegistroCobrancaEndpoint(endpoint);
    }

    public com.example.xmlns._1466775928160.PortType getRegistroCobrancaEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.xmlns._1466775928160.RegistroCobrancaEndpointBindingStub _stub = new com.example.xmlns._1466775928160.RegistroCobrancaEndpointBindingStub(portAddress, this);
            _stub.setPortName(getRegistroCobrancaEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegistroCobrancaEndpointEndpointAddress(java.lang.String address) {
        RegistroCobrancaEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.xmlns._1466775928160.PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.xmlns._1466775928160.RegistroCobrancaEndpointBindingStub _stub = new com.example.xmlns._1466775928160.RegistroCobrancaEndpointBindingStub(new java.net.URL(RegistroCobrancaEndpoint_address), this);
                _stub.setPortName(getRegistroCobrancaEndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RegistroCobrancaEndpoint".equals(inputPortName)) {
            return getRegistroCobrancaEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.example.com/1466775928160", "RegistroCobrancaService.serviceagent");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.example.com/1466775928160", "RegistroCobrancaEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RegistroCobrancaEndpoint".equals(portName)) {
            setRegistroCobrancaEndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
