package gr.army.usermanagement.datamodel;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Panagiotis Gouvas (KEPYES 28/5/2012)
 */
@Entity(name="USERS")
/*
@Table(name = "USERS", catalog = "", schema = "SXK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByTmhma", query = "SELECT u FROM User u WHERE u.tmhma = :tmhma"),
    @NamedQuery(name = "User.findByThlefwno", query = "SELECT u FROM User u WHERE u.thlefwno = :thlefwno"),
    @NamedQuery(name = "User.findByKathgoria", query = "SELECT u FROM User u WHERE u.kathgoria = :kathgoria"),
    @NamedQuery(name = "User.findByThesi", query = "SELECT u FROM User u WHERE u.thesi = :thesi"),
    @NamedQuery(name = "User.findByFullName", query = "SELECT u FROM User u WHERE u.fullName = :fullName"),
    @NamedQuery(name = "User.findByBathmos", query = "SELECT u FROM User u WHERE u.bathmos = :bathmos"),
    @NamedQuery(name = "User.findByEpwnymo", query = "SELECT u FROM User u WHERE u.epwnymo = :epwnymo"),
    @NamedQuery(name = "User.findByOnomaXrhsth", query = "SELECT u FROM User u WHERE u.onomaXrhsth = :onomaXrhsth"),
    @NamedQuery(name = "User.findByKwdikosMonados", query = "SELECT u FROM User u WHERE u.kwdikosMonados = :kwdikosMonados"),
    @NamedQuery(name = "User.findByDghEggrafhs", query = "SELECT u FROM User u WHERE u.dghEggrafhs = :dghEggrafhs"),
    @NamedQuery(name = "User.findByHmniaEggrafhs", query = "SELECT u FROM User u WHERE u.hmniaEggrafhs = :hmniaEggrafhs"),
    @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId"),
    @NamedQuery(name = "User.findByAm", query = "SELECT u FROM User u WHERE u.am = :am"),
    @NamedQuery(name = "User.findByMipCode", query = "SELECT u FROM User u WHERE u.mipCode = :mipCode"),
    @NamedQuery(name = "User.findByDorCode", query = "SELECT u FROM User u WHERE u.dorCode = :dorCode")})
*/
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    
    @Column(name = "AM")
    private String am;
    
    @Column(name = "MIP_CODE")
    private Long mipCode;
    
    @Column(name = "DOR_CODE")
    private Long dorCode;    
    
    @Column(name = "TMHMA")
    private String tmhma;
    @Column(name = "THLEFWNO")
    private String thlefwno;
    @Column(name = "KATHGORIA")
    private String kathgoria;
    @Column(name = "THESI")
    private String thesi;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "BATHMOS")
    private String bathmos;
    @Column(name = "EPWNYMO")
    private String epwnymo;
    @Column(name = "ONOMA_XRHSTH")
    private String onomaXrhsth;
    @Column(name = "KWDIKOS_MONADOS")
    private String kwdikosMonados;
    @Column(name = "DGH_EGGRAFHS")
    private String dghEggrafhs;
    @Column(name = "HMNIA_EGGRAFHS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hmniaEggrafhs;


    public User() {
    }

    
    public User(String userId) {
        this.userId = userId;
    }

    public String getTmhma() {
        return tmhma;
    }

    public void setTmhma(String tmhma) {
        this.tmhma = tmhma;
    }

    public String getThlefwno() {
        return thlefwno;
    }

    public void setThlefwno(String thlefwno) {
        this.thlefwno = thlefwno;
    }

    public String getKathgoria() {
        return kathgoria;
    }

    public void setKathgoria(String kathgoria) {
        this.kathgoria = kathgoria;
    }

    public String getThesi() {
        return thesi;
    }

    public void setThesi(String thesi) {
        this.thesi = thesi;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBathmos() {
        return bathmos;
    }

    public void setBathmos(String bathmos) {
        this.bathmos = bathmos;
    }

    public String getEpwnymo() {
        return epwnymo;
    }

    public void setEpwnymo(String epwnymo) {
        this.epwnymo = epwnymo;
    }

    public String getOnomaXrhsth() {
        return onomaXrhsth;
    }

    public void setOnomaXrhsth(String onomaXrhsth) {
        this.onomaXrhsth = onomaXrhsth;
    }

    public String getKwdikosMonados() {
        return kwdikosMonados;
    }

    public void setKwdikosMonados(String kwdikosMonados) {
        this.kwdikosMonados = kwdikosMonados;
    }

    public String getDghEggrafhs() {
        return dghEggrafhs;
    }

    public void setDghEggrafhs(String dghEggrafhs) {
        this.dghEggrafhs = dghEggrafhs;
    }

    public Date getHmniaEggrafhs() {
        return hmniaEggrafhs;
    }

    public void setHmniaEggrafhs(Date hmniaEggrafhs) {
        this.hmniaEggrafhs = hmniaEggrafhs;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public Long getMipCode() {
        return mipCode;
    }

    public void setMipCode(Long mipCode) {
        this.mipCode = mipCode;
    }

    public Long getDorCode() {
        return dorCode;
    }

    public void setDorCode(Long dorCode) {
        this.dorCode = dorCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.army.usermanagement.datamodel.User[ userId=" + userId + " ]";
    }


    
}
