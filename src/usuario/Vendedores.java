/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Natasha
 */
@Entity
@Table(name = "VENDEDORES", catalog = "", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vendedores.findAll", query = "SELECT v FROM Vendedores v"),
    @NamedQuery(name = "Vendedores.findByCodVendedor", query = "SELECT v FROM Vendedores v WHERE v.codVendedor = :codVendedor"),
    @NamedQuery(name = "Vendedores.findByNomeVendedor", query = "SELECT v FROM Vendedores v WHERE v.nomeVendedor = :nomeVendedor"),
    @NamedQuery(name = "Vendedores.findByDataCadVendedor", query = "SELECT v FROM Vendedores v WHERE v.dataCadVendedor = :dataCadVendedor")})
public class Vendedores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_VENDEDOR")
    private Integer codVendedor;
    @Basic(optional = false)
    @Column(name = "NOME_VENDEDOR")
    private String nomeVendedor;
    @Basic(optional = false)
    @Column(name = "DATA_CAD_VENDEDOR")
    @Temporal(TemporalType.DATE)
    private Date dataCadVendedor;

    public Vendedores() {
    }

    public Vendedores(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    public Vendedores(Integer codVendedor, String nomeVendedor, Date dataCadVendedor) {
        this.codVendedor = codVendedor;
        this.nomeVendedor = nomeVendedor;
        this.dataCadVendedor = dataCadVendedor;
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        Integer oldCodVendedor = this.codVendedor;
        this.codVendedor = codVendedor;
        changeSupport.firePropertyChange("codVendedor", oldCodVendedor, codVendedor);
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        String oldNomeVendedor = this.nomeVendedor;
        this.nomeVendedor = nomeVendedor;
        changeSupport.firePropertyChange("nomeVendedor", oldNomeVendedor, nomeVendedor);
    }

    public Date getDataCadVendedor() {
        return dataCadVendedor;
    }

    public void setDataCadVendedor(Date dataCadVendedor) {
        Date oldDataCadVendedor = this.dataCadVendedor;
        this.dataCadVendedor = dataCadVendedor;
        changeSupport.firePropertyChange("dataCadVendedor", oldDataCadVendedor, dataCadVendedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVendedor != null ? codVendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedores)) {
            return false;
        }
        Vendedores other = (Vendedores) object;
        if ((this.codVendedor == null && other.codVendedor != null) || (this.codVendedor != null && !this.codVendedor.equals(other.codVendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "usuario.Vendedores[ codVendedor=" + codVendedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
