package gr.army.usermanagement.datamodel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


/**
 *
 * @author Panagiotis Gouvas (KEPYES 28/5/2012)
 */

@Entity(name="USERS")
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    @NotBlank(message="Το πεδίο είναι υποχρεωτικό")
    private String userId;
    
    @NotNull
    @Size(min=2)
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
    
    @NotBlank(message="Το πεδίο Διαταγή είναι υποχρεωτικό")
    private String dghEggrafhs;
   
    @Column(name = "HMNIA_EGGRAFHS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hmniaEggrafhs;
    
    @Transient
    private String password;
    
    @Transient
    private String password2;
    
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

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the password2
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * @param password2 the password2 to set
     */
    public void setPassword2(String password2) {
        this.password2 = password2;
    }


    
}
