package id.co.askrindo.kmkpen.pen.model.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_sektor_ekonomi")
public class MSektorEkonomi {
    @Id
    @Column(name = "kode_sektor_ekonomi", nullable = false, length = 10)
    private String id;

    @Column(name = "mapping_produksi", length = 30)
    private String mappingProduksi;

    @Column(name = "sektor_bi", nullable = false, length = 512)
    private String sektorBi;

    @Column(name = "kode_lbu", length = 15)
    private String kodeLbu;

    @Column(name = "deskripsi_lbu", length = 512)
    private String deskripsiLbu;

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

    @Column(name = "group_lbu", length = 50)
    private String groupLbu;

    @Column(name = "kode_sektor_lbu", length = 15)
    private String kodeSektorLbu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMappingProduksi() {
        return mappingProduksi;
    }

    public void setMappingProduksi(String mappingProduksi) {
        this.mappingProduksi = mappingProduksi;
    }

    public String getSektorBi() {
        return sektorBi;
    }

    public void setSektorBi(String sektorBi) {
        this.sektorBi = sektorBi;
    }

    public String getKodeLbu() {
        return kodeLbu;
    }

    public void setKodeLbu(String kodeLbu) {
        this.kodeLbu = kodeLbu;
    }

    public String getDeskripsiLbu() {
        return deskripsiLbu;
    }

    public void setDeskripsiLbu(String deskripsiLbu) {
        this.deskripsiLbu = deskripsiLbu;
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

    public String getGroupLbu() {
        return groupLbu;
    }

    public void setGroupLbu(String groupLbu) {
        this.groupLbu = groupLbu;
    }

    public String getKodeSektorLbu() {
        return kodeSektorLbu;
    }

    public void setKodeSektorLbu(String kodeSektorLbu) {
        this.kodeSektorLbu = kodeSektorLbu;
    }

}