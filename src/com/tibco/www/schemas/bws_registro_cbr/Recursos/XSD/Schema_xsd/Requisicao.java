/**
 * Requisicao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tibco.www.schemas.bws_registro_cbr.Recursos.XSD.Schema_xsd;

public class Requisicao  implements java.io.Serializable {
    private java.lang.Integer numeroConvenio;

    private java.lang.Short numeroCarteira;

    private java.lang.Short numeroVariacaoCarteira;

    private java.lang.Short codigoModalidadeTitulo;

    private java.lang.String dataEmissaoTitulo;

    private java.lang.String dataVencimentoTitulo;

    private java.math.BigDecimal valorOriginalTitulo;

    private java.lang.Short codigoTipoDesconto;

    private java.lang.String dataDescontoTitulo;

    private java.math.BigDecimal percentualDescontoTitulo;

    private java.math.BigDecimal valorDescontoTitulo;

    private java.math.BigDecimal valorAbatimentoTitulo;

    private java.lang.Short quantidadeDiaProtesto;

    private java.lang.Short codigoTipoJuroMora;

    private java.math.BigDecimal percentualJuroMoraTitulo;

    private java.math.BigDecimal valorJuroMoraTitulo;

    private java.lang.Short codigoTipoMulta;

    private java.lang.String dataMultaTitulo;

    private java.math.BigDecimal percentualMultaTitulo;

    private java.math.BigDecimal valorMultaTitulo;

    private java.lang.String codigoAceiteTitulo;

    private java.lang.Short codigoTipoTitulo;

    private java.lang.String textoDescricaoTipoTitulo;

    private java.lang.String indicadorPermissaoRecebimentoParcial;

    private java.lang.String textoNumeroTituloBeneficiario;

    private java.lang.String textoCampoUtilizacaoBeneficiario;

    private java.lang.Short codigoTipoContaCaucao;

    private java.lang.String textoNumeroTituloCliente;

    private java.lang.String textoMensagemBloquetoOcorrencia;

    private java.lang.Short codigoTipoInscricaoPagador;

    private java.lang.Long numeroInscricaoPagador;

    private java.lang.String nomePagador;

    private java.lang.String textoEnderecoPagador;

    private java.lang.Integer numeroCepPagador;

    private java.lang.String nomeMunicipioPagador;

    private java.lang.String nomeBairroPagador;

    private java.lang.String siglaUfPagador;

    private java.lang.String textoNumeroTelefonePagador;

    private java.lang.Short codigoTipoInscricaoAvalista;

    private java.lang.Long numeroInscricaoAvalista;

    private java.lang.String nomeAvalistaTitulo;

    private java.lang.String codigoChaveUsuario;

    private java.lang.Short codigoTipoCanalSolicitacao;

    public Requisicao() {
    }

    public Requisicao(
           java.lang.Integer numeroConvenio,
           java.lang.Short numeroCarteira,
           java.lang.Short numeroVariacaoCarteira,
           java.lang.Short codigoModalidadeTitulo,
           java.lang.String dataEmissaoTitulo,
           java.lang.String dataVencimentoTitulo,
           java.math.BigDecimal valorOriginalTitulo,
           java.lang.Short codigoTipoDesconto,
           java.lang.String dataDescontoTitulo,
           java.math.BigDecimal percentualDescontoTitulo,
           java.math.BigDecimal valorDescontoTitulo,
           java.math.BigDecimal valorAbatimentoTitulo,
           java.lang.Short quantidadeDiaProtesto,
           java.lang.Short codigoTipoJuroMora,
           java.math.BigDecimal percentualJuroMoraTitulo,
           java.math.BigDecimal valorJuroMoraTitulo,
           java.lang.Short codigoTipoMulta,
           java.lang.String dataMultaTitulo,
           java.math.BigDecimal percentualMultaTitulo,
           java.math.BigDecimal valorMultaTitulo,
           java.lang.String codigoAceiteTitulo,
           java.lang.Short codigoTipoTitulo,
           java.lang.String textoDescricaoTipoTitulo,
           java.lang.String indicadorPermissaoRecebimentoParcial,
           java.lang.String textoNumeroTituloBeneficiario,
           java.lang.String textoCampoUtilizacaoBeneficiario,
           java.lang.Short codigoTipoContaCaucao,
           java.lang.String textoNumeroTituloCliente,
           java.lang.String textoMensagemBloquetoOcorrencia,
           java.lang.Short codigoTipoInscricaoPagador,
           java.lang.Long numeroInscricaoPagador,
           java.lang.String nomePagador,
           java.lang.String textoEnderecoPagador,
           java.lang.Integer numeroCepPagador,
           java.lang.String nomeMunicipioPagador,
           java.lang.String nomeBairroPagador,
           java.lang.String siglaUfPagador,
           java.lang.String textoNumeroTelefonePagador,
           java.lang.Short codigoTipoInscricaoAvalista,
           java.lang.Long numeroInscricaoAvalista,
           java.lang.String nomeAvalistaTitulo,
           java.lang.String codigoChaveUsuario,
           java.lang.Short codigoTipoCanalSolicitacao) {
           this.numeroConvenio = numeroConvenio;
           this.numeroCarteira = numeroCarteira;
           this.numeroVariacaoCarteira = numeroVariacaoCarteira;
           this.codigoModalidadeTitulo = codigoModalidadeTitulo;
           this.dataEmissaoTitulo = dataEmissaoTitulo;
           this.dataVencimentoTitulo = dataVencimentoTitulo;
           this.valorOriginalTitulo = valorOriginalTitulo;
           this.codigoTipoDesconto = codigoTipoDesconto;
           this.dataDescontoTitulo = dataDescontoTitulo;
           this.percentualDescontoTitulo = percentualDescontoTitulo;
           this.valorDescontoTitulo = valorDescontoTitulo;
           this.valorAbatimentoTitulo = valorAbatimentoTitulo;
           this.quantidadeDiaProtesto = quantidadeDiaProtesto;
           this.codigoTipoJuroMora = codigoTipoJuroMora;
           this.percentualJuroMoraTitulo = percentualJuroMoraTitulo;
           this.valorJuroMoraTitulo = valorJuroMoraTitulo;
           this.codigoTipoMulta = codigoTipoMulta;
           this.dataMultaTitulo = dataMultaTitulo;
           this.percentualMultaTitulo = percentualMultaTitulo;
           this.valorMultaTitulo = valorMultaTitulo;
           this.codigoAceiteTitulo = codigoAceiteTitulo;
           this.codigoTipoTitulo = codigoTipoTitulo;
           this.textoDescricaoTipoTitulo = textoDescricaoTipoTitulo;
           this.indicadorPermissaoRecebimentoParcial = indicadorPermissaoRecebimentoParcial;
           this.textoNumeroTituloBeneficiario = textoNumeroTituloBeneficiario;
           this.textoCampoUtilizacaoBeneficiario = textoCampoUtilizacaoBeneficiario;
           this.codigoTipoContaCaucao = codigoTipoContaCaucao;
           this.textoNumeroTituloCliente = textoNumeroTituloCliente;
           this.textoMensagemBloquetoOcorrencia = textoMensagemBloquetoOcorrencia;
           this.codigoTipoInscricaoPagador = codigoTipoInscricaoPagador;
           this.numeroInscricaoPagador = numeroInscricaoPagador;
           this.nomePagador = nomePagador;
           this.textoEnderecoPagador = textoEnderecoPagador;
           this.numeroCepPagador = numeroCepPagador;
           this.nomeMunicipioPagador = nomeMunicipioPagador;
           this.nomeBairroPagador = nomeBairroPagador;
           this.siglaUfPagador = siglaUfPagador;
           this.textoNumeroTelefonePagador = textoNumeroTelefonePagador;
           this.codigoTipoInscricaoAvalista = codigoTipoInscricaoAvalista;
           this.numeroInscricaoAvalista = numeroInscricaoAvalista;
           this.nomeAvalistaTitulo = nomeAvalistaTitulo;
           this.codigoChaveUsuario = codigoChaveUsuario;
           this.codigoTipoCanalSolicitacao = codigoTipoCanalSolicitacao;
    }


    /**
     * Gets the numeroConvenio value for this Requisicao.
     * 
     * @return numeroConvenio
     */
    public java.lang.Integer getNumeroConvenio() {
        return numeroConvenio;
    }


    /**
     * Sets the numeroConvenio value for this Requisicao.
     * 
     * @param numeroConvenio
     */
    public void setNumeroConvenio(java.lang.Integer numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }


    /**
     * Gets the numeroCarteira value for this Requisicao.
     * 
     * @return numeroCarteira
     */
    public java.lang.Short getNumeroCarteira() {
        return numeroCarteira;
    }


    /**
     * Sets the numeroCarteira value for this Requisicao.
     * 
     * @param numeroCarteira
     */
    public void setNumeroCarteira(java.lang.Short numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }


    /**
     * Gets the numeroVariacaoCarteira value for this Requisicao.
     * 
     * @return numeroVariacaoCarteira
     */
    public java.lang.Short getNumeroVariacaoCarteira() {
        return numeroVariacaoCarteira;
    }


    /**
     * Sets the numeroVariacaoCarteira value for this Requisicao.
     * 
     * @param numeroVariacaoCarteira
     */
    public void setNumeroVariacaoCarteira(java.lang.Short numeroVariacaoCarteira) {
        this.numeroVariacaoCarteira = numeroVariacaoCarteira;
    }


    /**
     * Gets the codigoModalidadeTitulo value for this Requisicao.
     * 
     * @return codigoModalidadeTitulo
     */
    public java.lang.Short getCodigoModalidadeTitulo() {
        return codigoModalidadeTitulo;
    }


    /**
     * Sets the codigoModalidadeTitulo value for this Requisicao.
     * 
     * @param codigoModalidadeTitulo
     */
    public void setCodigoModalidadeTitulo(java.lang.Short codigoModalidadeTitulo) {
        this.codigoModalidadeTitulo = codigoModalidadeTitulo;
    }


    /**
     * Gets the dataEmissaoTitulo value for this Requisicao.
     * 
     * @return dataEmissaoTitulo
     */
    public java.lang.String getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }


    /**
     * Sets the dataEmissaoTitulo value for this Requisicao.
     * 
     * @param dataEmissaoTitulo
     */
    public void setDataEmissaoTitulo(java.lang.String dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }


    /**
     * Gets the dataVencimentoTitulo value for this Requisicao.
     * 
     * @return dataVencimentoTitulo
     */
    public java.lang.String getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }


    /**
     * Sets the dataVencimentoTitulo value for this Requisicao.
     * 
     * @param dataVencimentoTitulo
     */
    public void setDataVencimentoTitulo(java.lang.String dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }


    /**
     * Gets the valorOriginalTitulo value for this Requisicao.
     * 
     * @return valorOriginalTitulo
     */
    public java.math.BigDecimal getValorOriginalTitulo() {
        return valorOriginalTitulo;
    }


    /**
     * Sets the valorOriginalTitulo value for this Requisicao.
     * 
     * @param valorOriginalTitulo
     */
    public void setValorOriginalTitulo(java.math.BigDecimal valorOriginalTitulo) {
        this.valorOriginalTitulo = valorOriginalTitulo;
    }


    /**
     * Gets the codigoTipoDesconto value for this Requisicao.
     * 
     * @return codigoTipoDesconto
     */
    public java.lang.Short getCodigoTipoDesconto() {
        return codigoTipoDesconto;
    }


    /**
     * Sets the codigoTipoDesconto value for this Requisicao.
     * 
     * @param codigoTipoDesconto
     */
    public void setCodigoTipoDesconto(java.lang.Short codigoTipoDesconto) {
        this.codigoTipoDesconto = codigoTipoDesconto;
    }


    /**
     * Gets the dataDescontoTitulo value for this Requisicao.
     * 
     * @return dataDescontoTitulo
     */
    public java.lang.String getDataDescontoTitulo() {
        return dataDescontoTitulo;
    }


    /**
     * Sets the dataDescontoTitulo value for this Requisicao.
     * 
     * @param dataDescontoTitulo
     */
    public void setDataDescontoTitulo(java.lang.String dataDescontoTitulo) {
        this.dataDescontoTitulo = dataDescontoTitulo;
    }


    /**
     * Gets the percentualDescontoTitulo value for this Requisicao.
     * 
     * @return percentualDescontoTitulo
     */
    public java.math.BigDecimal getPercentualDescontoTitulo() {
        return percentualDescontoTitulo;
    }


    /**
     * Sets the percentualDescontoTitulo value for this Requisicao.
     * 
     * @param percentualDescontoTitulo
     */
    public void setPercentualDescontoTitulo(java.math.BigDecimal percentualDescontoTitulo) {
        this.percentualDescontoTitulo = percentualDescontoTitulo;
    }


    /**
     * Gets the valorDescontoTitulo value for this Requisicao.
     * 
     * @return valorDescontoTitulo
     */
    public java.math.BigDecimal getValorDescontoTitulo() {
        return valorDescontoTitulo;
    }


    /**
     * Sets the valorDescontoTitulo value for this Requisicao.
     * 
     * @param valorDescontoTitulo
     */
    public void setValorDescontoTitulo(java.math.BigDecimal valorDescontoTitulo) {
        this.valorDescontoTitulo = valorDescontoTitulo;
    }


    /**
     * Gets the valorAbatimentoTitulo value for this Requisicao.
     * 
     * @return valorAbatimentoTitulo
     */
    public java.math.BigDecimal getValorAbatimentoTitulo() {
        return valorAbatimentoTitulo;
    }


    /**
     * Sets the valorAbatimentoTitulo value for this Requisicao.
     * 
     * @param valorAbatimentoTitulo
     */
    public void setValorAbatimentoTitulo(java.math.BigDecimal valorAbatimentoTitulo) {
        this.valorAbatimentoTitulo = valorAbatimentoTitulo;
    }


    /**
     * Gets the quantidadeDiaProtesto value for this Requisicao.
     * 
     * @return quantidadeDiaProtesto
     */
    public java.lang.Short getQuantidadeDiaProtesto() {
        return quantidadeDiaProtesto;
    }


    /**
     * Sets the quantidadeDiaProtesto value for this Requisicao.
     * 
     * @param quantidadeDiaProtesto
     */
    public void setQuantidadeDiaProtesto(java.lang.Short quantidadeDiaProtesto) {
        this.quantidadeDiaProtesto = quantidadeDiaProtesto;
    }


    /**
     * Gets the codigoTipoJuroMora value for this Requisicao.
     * 
     * @return codigoTipoJuroMora
     */
    public java.lang.Short getCodigoTipoJuroMora() {
        return codigoTipoJuroMora;
    }


    /**
     * Sets the codigoTipoJuroMora value for this Requisicao.
     * 
     * @param codigoTipoJuroMora
     */
    public void setCodigoTipoJuroMora(java.lang.Short codigoTipoJuroMora) {
        this.codigoTipoJuroMora = codigoTipoJuroMora;
    }


    /**
     * Gets the percentualJuroMoraTitulo value for this Requisicao.
     * 
     * @return percentualJuroMoraTitulo
     */
    public java.math.BigDecimal getPercentualJuroMoraTitulo() {
        return percentualJuroMoraTitulo;
    }


    /**
     * Sets the percentualJuroMoraTitulo value for this Requisicao.
     * 
     * @param percentualJuroMoraTitulo
     */
    public void setPercentualJuroMoraTitulo(java.math.BigDecimal percentualJuroMoraTitulo) {
        this.percentualJuroMoraTitulo = percentualJuroMoraTitulo;
    }


    /**
     * Gets the valorJuroMoraTitulo value for this Requisicao.
     * 
     * @return valorJuroMoraTitulo
     */
    public java.math.BigDecimal getValorJuroMoraTitulo() {
        return valorJuroMoraTitulo;
    }


    /**
     * Sets the valorJuroMoraTitulo value for this Requisicao.
     * 
     * @param valorJuroMoraTitulo
     */
    public void setValorJuroMoraTitulo(java.math.BigDecimal valorJuroMoraTitulo) {
        this.valorJuroMoraTitulo = valorJuroMoraTitulo;
    }


    /**
     * Gets the codigoTipoMulta value for this Requisicao.
     * 
     * @return codigoTipoMulta
     */
    public java.lang.Short getCodigoTipoMulta() {
        return codigoTipoMulta;
    }


    /**
     * Sets the codigoTipoMulta value for this Requisicao.
     * 
     * @param codigoTipoMulta
     */
    public void setCodigoTipoMulta(java.lang.Short codigoTipoMulta) {
        this.codigoTipoMulta = codigoTipoMulta;
    }


    /**
     * Gets the dataMultaTitulo value for this Requisicao.
     * 
     * @return dataMultaTitulo
     */
    public java.lang.String getDataMultaTitulo() {
        return dataMultaTitulo;
    }


    /**
     * Sets the dataMultaTitulo value for this Requisicao.
     * 
     * @param dataMultaTitulo
     */
    public void setDataMultaTitulo(java.lang.String dataMultaTitulo) {
        this.dataMultaTitulo = dataMultaTitulo;
    }


    /**
     * Gets the percentualMultaTitulo value for this Requisicao.
     * 
     * @return percentualMultaTitulo
     */
    public java.math.BigDecimal getPercentualMultaTitulo() {
        return percentualMultaTitulo;
    }


    /**
     * Sets the percentualMultaTitulo value for this Requisicao.
     * 
     * @param percentualMultaTitulo
     */
    public void setPercentualMultaTitulo(java.math.BigDecimal percentualMultaTitulo) {
        this.percentualMultaTitulo = percentualMultaTitulo;
    }


    /**
     * Gets the valorMultaTitulo value for this Requisicao.
     * 
     * @return valorMultaTitulo
     */
    public java.math.BigDecimal getValorMultaTitulo() {
        return valorMultaTitulo;
    }


    /**
     * Sets the valorMultaTitulo value for this Requisicao.
     * 
     * @param valorMultaTitulo
     */
    public void setValorMultaTitulo(java.math.BigDecimal valorMultaTitulo) {
        this.valorMultaTitulo = valorMultaTitulo;
    }


    /**
     * Gets the codigoAceiteTitulo value for this Requisicao.
     * 
     * @return codigoAceiteTitulo
     */
    public java.lang.String getCodigoAceiteTitulo() {
        return codigoAceiteTitulo;
    }


    /**
     * Sets the codigoAceiteTitulo value for this Requisicao.
     * 
     * @param codigoAceiteTitulo
     */
    public void setCodigoAceiteTitulo(java.lang.String codigoAceiteTitulo) {
        this.codigoAceiteTitulo = codigoAceiteTitulo;
    }


    /**
     * Gets the codigoTipoTitulo value for this Requisicao.
     * 
     * @return codigoTipoTitulo
     */
    public java.lang.Short getCodigoTipoTitulo() {
        return codigoTipoTitulo;
    }


    /**
     * Sets the codigoTipoTitulo value for this Requisicao.
     * 
     * @param codigoTipoTitulo
     */
    public void setCodigoTipoTitulo(java.lang.Short codigoTipoTitulo) {
        this.codigoTipoTitulo = codigoTipoTitulo;
    }


    /**
     * Gets the textoDescricaoTipoTitulo value for this Requisicao.
     * 
     * @return textoDescricaoTipoTitulo
     */
    public java.lang.String getTextoDescricaoTipoTitulo() {
        return textoDescricaoTipoTitulo;
    }


    /**
     * Sets the textoDescricaoTipoTitulo value for this Requisicao.
     * 
     * @param textoDescricaoTipoTitulo
     */
    public void setTextoDescricaoTipoTitulo(java.lang.String textoDescricaoTipoTitulo) {
        this.textoDescricaoTipoTitulo = textoDescricaoTipoTitulo;
    }


    /**
     * Gets the indicadorPermissaoRecebimentoParcial value for this Requisicao.
     * 
     * @return indicadorPermissaoRecebimentoParcial
     */
    public java.lang.String getIndicadorPermissaoRecebimentoParcial() {
        return indicadorPermissaoRecebimentoParcial;
    }


    /**
     * Sets the indicadorPermissaoRecebimentoParcial value for this Requisicao.
     * 
     * @param indicadorPermissaoRecebimentoParcial
     */
    public void setIndicadorPermissaoRecebimentoParcial(java.lang.String indicadorPermissaoRecebimentoParcial) {
        this.indicadorPermissaoRecebimentoParcial = indicadorPermissaoRecebimentoParcial;
    }


    /**
     * Gets the textoNumeroTituloBeneficiario value for this Requisicao.
     * 
     * @return textoNumeroTituloBeneficiario
     */
    public java.lang.String getTextoNumeroTituloBeneficiario() {
        return textoNumeroTituloBeneficiario;
    }


    /**
     * Sets the textoNumeroTituloBeneficiario value for this Requisicao.
     * 
     * @param textoNumeroTituloBeneficiario
     */
    public void setTextoNumeroTituloBeneficiario(java.lang.String textoNumeroTituloBeneficiario) {
        this.textoNumeroTituloBeneficiario = textoNumeroTituloBeneficiario;
    }


    /**
     * Gets the textoCampoUtilizacaoBeneficiario value for this Requisicao.
     * 
     * @return textoCampoUtilizacaoBeneficiario
     */
    public java.lang.String getTextoCampoUtilizacaoBeneficiario() {
        return textoCampoUtilizacaoBeneficiario;
    }


    /**
     * Sets the textoCampoUtilizacaoBeneficiario value for this Requisicao.
     * 
     * @param textoCampoUtilizacaoBeneficiario
     */
    public void setTextoCampoUtilizacaoBeneficiario(java.lang.String textoCampoUtilizacaoBeneficiario) {
        this.textoCampoUtilizacaoBeneficiario = textoCampoUtilizacaoBeneficiario;
    }


    /**
     * Gets the codigoTipoContaCaucao value for this Requisicao.
     * 
     * @return codigoTipoContaCaucao
     */
    public java.lang.Short getCodigoTipoContaCaucao() {
        return codigoTipoContaCaucao;
    }


    /**
     * Sets the codigoTipoContaCaucao value for this Requisicao.
     * 
     * @param codigoTipoContaCaucao
     */
    public void setCodigoTipoContaCaucao(java.lang.Short codigoTipoContaCaucao) {
        this.codigoTipoContaCaucao = codigoTipoContaCaucao;
    }


    /**
     * Gets the textoNumeroTituloCliente value for this Requisicao.
     * 
     * @return textoNumeroTituloCliente
     */
    public java.lang.String getTextoNumeroTituloCliente() {
        return textoNumeroTituloCliente;
    }


    /**
     * Sets the textoNumeroTituloCliente value for this Requisicao.
     * 
     * @param textoNumeroTituloCliente
     */
    public void setTextoNumeroTituloCliente(java.lang.String textoNumeroTituloCliente) {
        this.textoNumeroTituloCliente = textoNumeroTituloCliente;
    }


    /**
     * Gets the textoMensagemBloquetoOcorrencia value for this Requisicao.
     * 
     * @return textoMensagemBloquetoOcorrencia
     */
    public java.lang.String getTextoMensagemBloquetoOcorrencia() {
        return textoMensagemBloquetoOcorrencia;
    }


    /**
     * Sets the textoMensagemBloquetoOcorrencia value for this Requisicao.
     * 
     * @param textoMensagemBloquetoOcorrencia
     */
    public void setTextoMensagemBloquetoOcorrencia(java.lang.String textoMensagemBloquetoOcorrencia) {
        this.textoMensagemBloquetoOcorrencia = textoMensagemBloquetoOcorrencia;
    }


    /**
     * Gets the codigoTipoInscricaoPagador value for this Requisicao.
     * 
     * @return codigoTipoInscricaoPagador
     */
    public java.lang.Short getCodigoTipoInscricaoPagador() {
        return codigoTipoInscricaoPagador;
    }


    /**
     * Sets the codigoTipoInscricaoPagador value for this Requisicao.
     * 
     * @param codigoTipoInscricaoPagador
     */
    public void setCodigoTipoInscricaoPagador(java.lang.Short codigoTipoInscricaoPagador) {
        this.codigoTipoInscricaoPagador = codigoTipoInscricaoPagador;
    }


    /**
     * Gets the numeroInscricaoPagador value for this Requisicao.
     * 
     * @return numeroInscricaoPagador
     */
    public java.lang.Long getNumeroInscricaoPagador() {
        return numeroInscricaoPagador;
    }


    /**
     * Sets the numeroInscricaoPagador value for this Requisicao.
     * 
     * @param numeroInscricaoPagador
     */
    public void setNumeroInscricaoPagador(java.lang.Long numeroInscricaoPagador) {
        this.numeroInscricaoPagador = numeroInscricaoPagador;
    }


    /**
     * Gets the nomePagador value for this Requisicao.
     * 
     * @return nomePagador
     */
    public java.lang.String getNomePagador() {
        return nomePagador;
    }


    /**
     * Sets the nomePagador value for this Requisicao.
     * 
     * @param nomePagador
     */
    public void setNomePagador(java.lang.String nomePagador) {
        this.nomePagador = nomePagador;
    }


    /**
     * Gets the textoEnderecoPagador value for this Requisicao.
     * 
     * @return textoEnderecoPagador
     */
    public java.lang.String getTextoEnderecoPagador() {
        return textoEnderecoPagador;
    }


    /**
     * Sets the textoEnderecoPagador value for this Requisicao.
     * 
     * @param textoEnderecoPagador
     */
    public void setTextoEnderecoPagador(java.lang.String textoEnderecoPagador) {
        this.textoEnderecoPagador = textoEnderecoPagador;
    }


    /**
     * Gets the numeroCepPagador value for this Requisicao.
     * 
     * @return numeroCepPagador
     */
    public java.lang.Integer getNumeroCepPagador() {
        return numeroCepPagador;
    }


    /**
     * Sets the numeroCepPagador value for this Requisicao.
     * 
     * @param numeroCepPagador
     */
    public void setNumeroCepPagador(java.lang.Integer numeroCepPagador) {
        this.numeroCepPagador = numeroCepPagador;
    }


    /**
     * Gets the nomeMunicipioPagador value for this Requisicao.
     * 
     * @return nomeMunicipioPagador
     */
    public java.lang.String getNomeMunicipioPagador() {
        return nomeMunicipioPagador;
    }


    /**
     * Sets the nomeMunicipioPagador value for this Requisicao.
     * 
     * @param nomeMunicipioPagador
     */
    public void setNomeMunicipioPagador(java.lang.String nomeMunicipioPagador) {
        this.nomeMunicipioPagador = nomeMunicipioPagador;
    }


    /**
     * Gets the nomeBairroPagador value for this Requisicao.
     * 
     * @return nomeBairroPagador
     */
    public java.lang.String getNomeBairroPagador() {
        return nomeBairroPagador;
    }


    /**
     * Sets the nomeBairroPagador value for this Requisicao.
     * 
     * @param nomeBairroPagador
     */
    public void setNomeBairroPagador(java.lang.String nomeBairroPagador) {
        this.nomeBairroPagador = nomeBairroPagador;
    }


    /**
     * Gets the siglaUfPagador value for this Requisicao.
     * 
     * @return siglaUfPagador
     */
    public java.lang.String getSiglaUfPagador() {
        return siglaUfPagador;
    }


    /**
     * Sets the siglaUfPagador value for this Requisicao.
     * 
     * @param siglaUfPagador
     */
    public void setSiglaUfPagador(java.lang.String siglaUfPagador) {
        this.siglaUfPagador = siglaUfPagador;
    }


    /**
     * Gets the textoNumeroTelefonePagador value for this Requisicao.
     * 
     * @return textoNumeroTelefonePagador
     */
    public java.lang.String getTextoNumeroTelefonePagador() {
        return textoNumeroTelefonePagador;
    }


    /**
     * Sets the textoNumeroTelefonePagador value for this Requisicao.
     * 
     * @param textoNumeroTelefonePagador
     */
    public void setTextoNumeroTelefonePagador(java.lang.String textoNumeroTelefonePagador) {
        this.textoNumeroTelefonePagador = textoNumeroTelefonePagador;
    }


    /**
     * Gets the codigoTipoInscricaoAvalista value for this Requisicao.
     * 
     * @return codigoTipoInscricaoAvalista
     */
    public java.lang.Short getCodigoTipoInscricaoAvalista() {
        return codigoTipoInscricaoAvalista;
    }


    /**
     * Sets the codigoTipoInscricaoAvalista value for this Requisicao.
     * 
     * @param codigoTipoInscricaoAvalista
     */
    public void setCodigoTipoInscricaoAvalista(java.lang.Short codigoTipoInscricaoAvalista) {
        this.codigoTipoInscricaoAvalista = codigoTipoInscricaoAvalista;
    }


    /**
     * Gets the numeroInscricaoAvalista value for this Requisicao.
     * 
     * @return numeroInscricaoAvalista
     */
    public java.lang.Long getNumeroInscricaoAvalista() {
        return numeroInscricaoAvalista;
    }


    /**
     * Sets the numeroInscricaoAvalista value for this Requisicao.
     * 
     * @param numeroInscricaoAvalista
     */
    public void setNumeroInscricaoAvalista(java.lang.Long numeroInscricaoAvalista) {
        this.numeroInscricaoAvalista = numeroInscricaoAvalista;
    }


    /**
     * Gets the nomeAvalistaTitulo value for this Requisicao.
     * 
     * @return nomeAvalistaTitulo
     */
    public java.lang.String getNomeAvalistaTitulo() {
        return nomeAvalistaTitulo;
    }


    /**
     * Sets the nomeAvalistaTitulo value for this Requisicao.
     * 
     * @param nomeAvalistaTitulo
     */
    public void setNomeAvalistaTitulo(java.lang.String nomeAvalistaTitulo) {
        this.nomeAvalistaTitulo = nomeAvalistaTitulo;
    }


    /**
     * Gets the codigoChaveUsuario value for this Requisicao.
     * 
     * @return codigoChaveUsuario
     */
    public java.lang.String getCodigoChaveUsuario() {
        return codigoChaveUsuario;
    }


    /**
     * Sets the codigoChaveUsuario value for this Requisicao.
     * 
     * @param codigoChaveUsuario
     */
    public void setCodigoChaveUsuario(java.lang.String codigoChaveUsuario) {
        this.codigoChaveUsuario = codigoChaveUsuario;
    }


    /**
     * Gets the codigoTipoCanalSolicitacao value for this Requisicao.
     * 
     * @return codigoTipoCanalSolicitacao
     */
    public java.lang.Short getCodigoTipoCanalSolicitacao() {
        return codigoTipoCanalSolicitacao;
    }


    /**
     * Sets the codigoTipoCanalSolicitacao value for this Requisicao.
     * 
     * @param codigoTipoCanalSolicitacao
     */
    public void setCodigoTipoCanalSolicitacao(java.lang.Short codigoTipoCanalSolicitacao) {
        this.codigoTipoCanalSolicitacao = codigoTipoCanalSolicitacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Requisicao)) return false;
        Requisicao other = (Requisicao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroConvenio==null && other.getNumeroConvenio()==null) || 
             (this.numeroConvenio!=null &&
              this.numeroConvenio.equals(other.getNumeroConvenio()))) &&
            ((this.numeroCarteira==null && other.getNumeroCarteira()==null) || 
             (this.numeroCarteira!=null &&
              this.numeroCarteira.equals(other.getNumeroCarteira()))) &&
            ((this.numeroVariacaoCarteira==null && other.getNumeroVariacaoCarteira()==null) || 
             (this.numeroVariacaoCarteira!=null &&
              this.numeroVariacaoCarteira.equals(other.getNumeroVariacaoCarteira()))) &&
            ((this.codigoModalidadeTitulo==null && other.getCodigoModalidadeTitulo()==null) || 
             (this.codigoModalidadeTitulo!=null &&
              this.codigoModalidadeTitulo.equals(other.getCodigoModalidadeTitulo()))) &&
            ((this.dataEmissaoTitulo==null && other.getDataEmissaoTitulo()==null) || 
             (this.dataEmissaoTitulo!=null &&
              this.dataEmissaoTitulo.equals(other.getDataEmissaoTitulo()))) &&
            ((this.dataVencimentoTitulo==null && other.getDataVencimentoTitulo()==null) || 
             (this.dataVencimentoTitulo!=null &&
              this.dataVencimentoTitulo.equals(other.getDataVencimentoTitulo()))) &&
            ((this.valorOriginalTitulo==null && other.getValorOriginalTitulo()==null) || 
             (this.valorOriginalTitulo!=null &&
              this.valorOriginalTitulo.equals(other.getValorOriginalTitulo()))) &&
            ((this.codigoTipoDesconto==null && other.getCodigoTipoDesconto()==null) || 
             (this.codigoTipoDesconto!=null &&
              this.codigoTipoDesconto.equals(other.getCodigoTipoDesconto()))) &&
            ((this.dataDescontoTitulo==null && other.getDataDescontoTitulo()==null) || 
             (this.dataDescontoTitulo!=null &&
              this.dataDescontoTitulo.equals(other.getDataDescontoTitulo()))) &&
            ((this.percentualDescontoTitulo==null && other.getPercentualDescontoTitulo()==null) || 
             (this.percentualDescontoTitulo!=null &&
              this.percentualDescontoTitulo.equals(other.getPercentualDescontoTitulo()))) &&
            ((this.valorDescontoTitulo==null && other.getValorDescontoTitulo()==null) || 
             (this.valorDescontoTitulo!=null &&
              this.valorDescontoTitulo.equals(other.getValorDescontoTitulo()))) &&
            ((this.valorAbatimentoTitulo==null && other.getValorAbatimentoTitulo()==null) || 
             (this.valorAbatimentoTitulo!=null &&
              this.valorAbatimentoTitulo.equals(other.getValorAbatimentoTitulo()))) &&
            ((this.quantidadeDiaProtesto==null && other.getQuantidadeDiaProtesto()==null) || 
             (this.quantidadeDiaProtesto!=null &&
              this.quantidadeDiaProtesto.equals(other.getQuantidadeDiaProtesto()))) &&
            ((this.codigoTipoJuroMora==null && other.getCodigoTipoJuroMora()==null) || 
             (this.codigoTipoJuroMora!=null &&
              this.codigoTipoJuroMora.equals(other.getCodigoTipoJuroMora()))) &&
            ((this.percentualJuroMoraTitulo==null && other.getPercentualJuroMoraTitulo()==null) || 
             (this.percentualJuroMoraTitulo!=null &&
              this.percentualJuroMoraTitulo.equals(other.getPercentualJuroMoraTitulo()))) &&
            ((this.valorJuroMoraTitulo==null && other.getValorJuroMoraTitulo()==null) || 
             (this.valorJuroMoraTitulo!=null &&
              this.valorJuroMoraTitulo.equals(other.getValorJuroMoraTitulo()))) &&
            ((this.codigoTipoMulta==null && other.getCodigoTipoMulta()==null) || 
             (this.codigoTipoMulta!=null &&
              this.codigoTipoMulta.equals(other.getCodigoTipoMulta()))) &&
            ((this.dataMultaTitulo==null && other.getDataMultaTitulo()==null) || 
             (this.dataMultaTitulo!=null &&
              this.dataMultaTitulo.equals(other.getDataMultaTitulo()))) &&
            ((this.percentualMultaTitulo==null && other.getPercentualMultaTitulo()==null) || 
             (this.percentualMultaTitulo!=null &&
              this.percentualMultaTitulo.equals(other.getPercentualMultaTitulo()))) &&
            ((this.valorMultaTitulo==null && other.getValorMultaTitulo()==null) || 
             (this.valorMultaTitulo!=null &&
              this.valorMultaTitulo.equals(other.getValorMultaTitulo()))) &&
            ((this.codigoAceiteTitulo==null && other.getCodigoAceiteTitulo()==null) || 
             (this.codigoAceiteTitulo!=null &&
              this.codigoAceiteTitulo.equals(other.getCodigoAceiteTitulo()))) &&
            ((this.codigoTipoTitulo==null && other.getCodigoTipoTitulo()==null) || 
             (this.codigoTipoTitulo!=null &&
              this.codigoTipoTitulo.equals(other.getCodigoTipoTitulo()))) &&
            ((this.textoDescricaoTipoTitulo==null && other.getTextoDescricaoTipoTitulo()==null) || 
             (this.textoDescricaoTipoTitulo!=null &&
              this.textoDescricaoTipoTitulo.equals(other.getTextoDescricaoTipoTitulo()))) &&
            ((this.indicadorPermissaoRecebimentoParcial==null && other.getIndicadorPermissaoRecebimentoParcial()==null) || 
             (this.indicadorPermissaoRecebimentoParcial!=null &&
              this.indicadorPermissaoRecebimentoParcial.equals(other.getIndicadorPermissaoRecebimentoParcial()))) &&
            ((this.textoNumeroTituloBeneficiario==null && other.getTextoNumeroTituloBeneficiario()==null) || 
             (this.textoNumeroTituloBeneficiario!=null &&
              this.textoNumeroTituloBeneficiario.equals(other.getTextoNumeroTituloBeneficiario()))) &&
            ((this.textoCampoUtilizacaoBeneficiario==null && other.getTextoCampoUtilizacaoBeneficiario()==null) || 
             (this.textoCampoUtilizacaoBeneficiario!=null &&
              this.textoCampoUtilizacaoBeneficiario.equals(other.getTextoCampoUtilizacaoBeneficiario()))) &&
            ((this.codigoTipoContaCaucao==null && other.getCodigoTipoContaCaucao()==null) || 
             (this.codigoTipoContaCaucao!=null &&
              this.codigoTipoContaCaucao.equals(other.getCodigoTipoContaCaucao()))) &&
            ((this.textoNumeroTituloCliente==null && other.getTextoNumeroTituloCliente()==null) || 
             (this.textoNumeroTituloCliente!=null &&
              this.textoNumeroTituloCliente.equals(other.getTextoNumeroTituloCliente()))) &&
            ((this.textoMensagemBloquetoOcorrencia==null && other.getTextoMensagemBloquetoOcorrencia()==null) || 
             (this.textoMensagemBloquetoOcorrencia!=null &&
              this.textoMensagemBloquetoOcorrencia.equals(other.getTextoMensagemBloquetoOcorrencia()))) &&
            ((this.codigoTipoInscricaoPagador==null && other.getCodigoTipoInscricaoPagador()==null) || 
             (this.codigoTipoInscricaoPagador!=null &&
              this.codigoTipoInscricaoPagador.equals(other.getCodigoTipoInscricaoPagador()))) &&
            ((this.numeroInscricaoPagador==null && other.getNumeroInscricaoPagador()==null) || 
             (this.numeroInscricaoPagador!=null &&
              this.numeroInscricaoPagador.equals(other.getNumeroInscricaoPagador()))) &&
            ((this.nomePagador==null && other.getNomePagador()==null) || 
             (this.nomePagador!=null &&
              this.nomePagador.equals(other.getNomePagador()))) &&
            ((this.textoEnderecoPagador==null && other.getTextoEnderecoPagador()==null) || 
             (this.textoEnderecoPagador!=null &&
              this.textoEnderecoPagador.equals(other.getTextoEnderecoPagador()))) &&
            ((this.numeroCepPagador==null && other.getNumeroCepPagador()==null) || 
             (this.numeroCepPagador!=null &&
              this.numeroCepPagador.equals(other.getNumeroCepPagador()))) &&
            ((this.nomeMunicipioPagador==null && other.getNomeMunicipioPagador()==null) || 
             (this.nomeMunicipioPagador!=null &&
              this.nomeMunicipioPagador.equals(other.getNomeMunicipioPagador()))) &&
            ((this.nomeBairroPagador==null && other.getNomeBairroPagador()==null) || 
             (this.nomeBairroPagador!=null &&
              this.nomeBairroPagador.equals(other.getNomeBairroPagador()))) &&
            ((this.siglaUfPagador==null && other.getSiglaUfPagador()==null) || 
             (this.siglaUfPagador!=null &&
              this.siglaUfPagador.equals(other.getSiglaUfPagador()))) &&
            ((this.textoNumeroTelefonePagador==null && other.getTextoNumeroTelefonePagador()==null) || 
             (this.textoNumeroTelefonePagador!=null &&
              this.textoNumeroTelefonePagador.equals(other.getTextoNumeroTelefonePagador()))) &&
            ((this.codigoTipoInscricaoAvalista==null && other.getCodigoTipoInscricaoAvalista()==null) || 
             (this.codigoTipoInscricaoAvalista!=null &&
              this.codigoTipoInscricaoAvalista.equals(other.getCodigoTipoInscricaoAvalista()))) &&
            ((this.numeroInscricaoAvalista==null && other.getNumeroInscricaoAvalista()==null) || 
             (this.numeroInscricaoAvalista!=null &&
              this.numeroInscricaoAvalista.equals(other.getNumeroInscricaoAvalista()))) &&
            ((this.nomeAvalistaTitulo==null && other.getNomeAvalistaTitulo()==null) || 
             (this.nomeAvalistaTitulo!=null &&
              this.nomeAvalistaTitulo.equals(other.getNomeAvalistaTitulo()))) &&
            ((this.codigoChaveUsuario==null && other.getCodigoChaveUsuario()==null) || 
             (this.codigoChaveUsuario!=null &&
              this.codigoChaveUsuario.equals(other.getCodigoChaveUsuario()))) &&
            ((this.codigoTipoCanalSolicitacao==null && other.getCodigoTipoCanalSolicitacao()==null) || 
             (this.codigoTipoCanalSolicitacao!=null &&
              this.codigoTipoCanalSolicitacao.equals(other.getCodigoTipoCanalSolicitacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumeroConvenio() != null) {
            _hashCode += getNumeroConvenio().hashCode();
        }
        if (getNumeroCarteira() != null) {
            _hashCode += getNumeroCarteira().hashCode();
        }
        if (getNumeroVariacaoCarteira() != null) {
            _hashCode += getNumeroVariacaoCarteira().hashCode();
        }
        if (getCodigoModalidadeTitulo() != null) {
            _hashCode += getCodigoModalidadeTitulo().hashCode();
        }
        if (getDataEmissaoTitulo() != null) {
            _hashCode += getDataEmissaoTitulo().hashCode();
        }
        if (getDataVencimentoTitulo() != null) {
            _hashCode += getDataVencimentoTitulo().hashCode();
        }
        if (getValorOriginalTitulo() != null) {
            _hashCode += getValorOriginalTitulo().hashCode();
        }
        if (getCodigoTipoDesconto() != null) {
            _hashCode += getCodigoTipoDesconto().hashCode();
        }
        if (getDataDescontoTitulo() != null) {
            _hashCode += getDataDescontoTitulo().hashCode();
        }
        if (getPercentualDescontoTitulo() != null) {
            _hashCode += getPercentualDescontoTitulo().hashCode();
        }
        if (getValorDescontoTitulo() != null) {
            _hashCode += getValorDescontoTitulo().hashCode();
        }
        if (getValorAbatimentoTitulo() != null) {
            _hashCode += getValorAbatimentoTitulo().hashCode();
        }
        if (getQuantidadeDiaProtesto() != null) {
            _hashCode += getQuantidadeDiaProtesto().hashCode();
        }
        if (getCodigoTipoJuroMora() != null) {
            _hashCode += getCodigoTipoJuroMora().hashCode();
        }
        if (getPercentualJuroMoraTitulo() != null) {
            _hashCode += getPercentualJuroMoraTitulo().hashCode();
        }
        if (getValorJuroMoraTitulo() != null) {
            _hashCode += getValorJuroMoraTitulo().hashCode();
        }
        if (getCodigoTipoMulta() != null) {
            _hashCode += getCodigoTipoMulta().hashCode();
        }
        if (getDataMultaTitulo() != null) {
            _hashCode += getDataMultaTitulo().hashCode();
        }
        if (getPercentualMultaTitulo() != null) {
            _hashCode += getPercentualMultaTitulo().hashCode();
        }
        if (getValorMultaTitulo() != null) {
            _hashCode += getValorMultaTitulo().hashCode();
        }
        if (getCodigoAceiteTitulo() != null) {
            _hashCode += getCodigoAceiteTitulo().hashCode();
        }
        if (getCodigoTipoTitulo() != null) {
            _hashCode += getCodigoTipoTitulo().hashCode();
        }
        if (getTextoDescricaoTipoTitulo() != null) {
            _hashCode += getTextoDescricaoTipoTitulo().hashCode();
        }
        if (getIndicadorPermissaoRecebimentoParcial() != null) {
            _hashCode += getIndicadorPermissaoRecebimentoParcial().hashCode();
        }
        if (getTextoNumeroTituloBeneficiario() != null) {
            _hashCode += getTextoNumeroTituloBeneficiario().hashCode();
        }
        if (getTextoCampoUtilizacaoBeneficiario() != null) {
            _hashCode += getTextoCampoUtilizacaoBeneficiario().hashCode();
        }
        if (getCodigoTipoContaCaucao() != null) {
            _hashCode += getCodigoTipoContaCaucao().hashCode();
        }
        if (getTextoNumeroTituloCliente() != null) {
            _hashCode += getTextoNumeroTituloCliente().hashCode();
        }
        if (getTextoMensagemBloquetoOcorrencia() != null) {
            _hashCode += getTextoMensagemBloquetoOcorrencia().hashCode();
        }
        if (getCodigoTipoInscricaoPagador() != null) {
            _hashCode += getCodigoTipoInscricaoPagador().hashCode();
        }
        if (getNumeroInscricaoPagador() != null) {
            _hashCode += getNumeroInscricaoPagador().hashCode();
        }
        if (getNomePagador() != null) {
            _hashCode += getNomePagador().hashCode();
        }
        if (getTextoEnderecoPagador() != null) {
            _hashCode += getTextoEnderecoPagador().hashCode();
        }
        if (getNumeroCepPagador() != null) {
            _hashCode += getNumeroCepPagador().hashCode();
        }
        if (getNomeMunicipioPagador() != null) {
            _hashCode += getNomeMunicipioPagador().hashCode();
        }
        if (getNomeBairroPagador() != null) {
            _hashCode += getNomeBairroPagador().hashCode();
        }
        if (getSiglaUfPagador() != null) {
            _hashCode += getSiglaUfPagador().hashCode();
        }
        if (getTextoNumeroTelefonePagador() != null) {
            _hashCode += getTextoNumeroTelefonePagador().hashCode();
        }
        if (getCodigoTipoInscricaoAvalista() != null) {
            _hashCode += getCodigoTipoInscricaoAvalista().hashCode();
        }
        if (getNumeroInscricaoAvalista() != null) {
            _hashCode += getNumeroInscricaoAvalista().hashCode();
        }
        if (getNomeAvalistaTitulo() != null) {
            _hashCode += getNomeAvalistaTitulo().hashCode();
        }
        if (getCodigoChaveUsuario() != null) {
            _hashCode += getCodigoChaveUsuario().hashCode();
        }
        if (getCodigoTipoCanalSolicitacao() != null) {
            _hashCode += getCodigoTipoCanalSolicitacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Requisicao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", ">requisicao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroConvenio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroConvenio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCarteira");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroCarteira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroVariacaoCarteira");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroVariacaoCarteira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModalidadeTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoModalidadeTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEmissaoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "dataEmissaoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVencimentoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "dataVencimentoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorOriginalTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "valorOriginalTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDescontoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "dataDescontoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualDescontoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "percentualDescontoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDescontoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "valorDescontoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAbatimentoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "valorAbatimentoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeDiaProtesto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "quantidadeDiaProtesto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoJuroMora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoJuroMora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualJuroMoraTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "percentualJuroMoraTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorJuroMoraTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "valorJuroMoraTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataMultaTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "dataMultaTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualMultaTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "percentualMultaTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorMultaTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "valorMultaTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAceiteTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoAceiteTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoDescricaoTipoTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoDescricaoTipoTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorPermissaoRecebimentoParcial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "indicadorPermissaoRecebimentoParcial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoNumeroTituloBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoNumeroTituloBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoCampoUtilizacaoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoCampoUtilizacaoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoContaCaucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoContaCaucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoNumeroTituloCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoNumeroTituloCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoMensagemBloquetoOcorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoMensagemBloquetoOcorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoInscricaoPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoInscricaoPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInscricaoPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroInscricaoPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "nomePagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoEnderecoPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoEnderecoPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCepPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroCepPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMunicipioPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "nomeMunicipioPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeBairroPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "nomeBairroPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUfPagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "siglaUfPagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoNumeroTelefonePagador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "textoNumeroTelefonePagador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoInscricaoAvalista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoInscricaoAvalista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInscricaoAvalista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "numeroInscricaoAvalista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAvalistaTitulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "nomeAvalistaTitulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoChaveUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoChaveUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoCanalSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/bws_registro_cbr/Recursos/XSD/Schema.xsd", "codigoTipoCanalSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
