package id.co.askrindo.kmkpen.pen.model.master;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "m_mapping_bank")
public class MMappingBank {
    @Id
    @Column(name = "mapping_bank_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kode_bank", nullable = false)
    private MBank kodeBank;

    @Column(name = "kode_cabang_bank", nullable = false, length = 8)
    private String kodeCabangBank;

    @Column(name = "kode_cabang_askrindo", nullable = false, length = 3)
    private String kodeCabangAskrindo;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "modified_by", length = 20)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MBank getKodeBank() {
        return kodeBank;
    }

    public void setKodeBank(MBank kodeBank) {
        this.kodeBank = kodeBank;
    }

    public String getKodeCabangBank() {
        return kodeCabangBank;
    }

    public void setKodeCabangBank(String kodeCabangBank) {
        this.kodeCabangBank = kodeCabangBank;
    }

    public String getKodeCabangAskrindo() {
        return kodeCabangAskrindo;
    }

    public void setKodeCabangAskrindo(String kodeCabangAskrindo) {
        this.kodeCabangAskrindo = kodeCabangAskrindo;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}