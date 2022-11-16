package id.co.askrindo.kmkpen.ejamku.model.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nik",
        "nama",
        "pendidikan",
        "pekerjaan",
        "alamat",
        "npwp",
        "keterangan",
        "tgl_lahir",
        "jns_kelamin",
        "maritas_sts",
        "jns_debitur",
        "kode_kabkota",
        "kode_pos",
        "mulai_usaha",
        "alamat_usaha",
        "ijin_usaha",
        "modal_usaha",
        "jml_pekerja",
        "no_hp",
        "uraian_agunan",
        "omset"
})
@Generated("jsonschema2pojo")
public class CalonDebitur {

    @JsonProperty("nik")
    private String nik;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("pendidikan")
    private Integer pendidikan;
    @JsonProperty("pekerjaan")
    private Integer pekerjaan;
    @JsonProperty("alamat")
    private String alamat;
    @JsonProperty("npwp")
    private String npwp;
    @JsonProperty("keterangan")
    private Object keterangan;
    @JsonProperty("tgl_lahir")
    private Date tglLahir;
    @JsonProperty("jns_kelamin")
    private Integer jnsKelamin;
    @JsonProperty("maritas_sts")
    private Integer maritasSts;
    @JsonProperty("jns_debitur")
    private String jnsDebitur;
    @JsonProperty("kode_kabkota")
    private String kodeKabkota;
    @JsonProperty("kode_pos")
    private String kodePos;
    @JsonProperty("mulai_usaha")
    private String mulaiUsaha;
    @JsonProperty("alamat_usaha")
    private String alamatUsaha;
    @JsonProperty("ijin_usaha")
    private String ijinUsaha;
    @JsonProperty("modal_usaha")
    private BigDecimal modalUsaha;
    @JsonProperty("jml_pekerja")
    private Integer jmlPekerja;
    @JsonProperty("no_hp")
    private String noHp;
    @JsonProperty("uraian_agunan")
    private String uraianAgunan;
    @JsonProperty("omset")
    private Object omset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nik")
    public String getNik() {
        return nik;
    }

    @JsonProperty("nik")
    public void setNik(String nik) {
        this.nik = nik;
    }

    @JsonProperty("nama")
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
    }

    @JsonProperty("pendidikan")
    public Integer getPendidikan() {
        return pendidikan;
    }

    @JsonProperty("pendidikan")
    public void setPendidikan(Integer pendidikan) {
        this.pendidikan = pendidikan;
    }

    @JsonProperty("pekerjaan")
    public Integer getPekerjaan() {
        return pekerjaan;
    }

    @JsonProperty("pekerjaan")
    public void setPekerjaan(Integer pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @JsonProperty("alamat")
    public String getAlamat() {
        return alamat;
    }

    @JsonProperty("alamat")
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @JsonProperty("npwp")
    public String getNpwp() {
        return npwp;
    }

    @JsonProperty("npwp")
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @JsonProperty("keterangan")
    public Object getKeterangan() {
        return keterangan;
    }

    @JsonProperty("keterangan")
    public void setKeterangan(Object keterangan) {
        this.keterangan = keterangan;
    }

    @JsonProperty("tgl_lahir")
    public Date getTglLahir() {
        return tglLahir;
    }

    @JsonProperty("tgl_lahir")
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    @JsonProperty("jns_kelamin")
    public Integer getJnsKelamin() {
        return jnsKelamin;
    }

    @JsonProperty("jns_kelamin")
    public void setJnsKelamin(Integer jnsKelamin) {
        this.jnsKelamin = jnsKelamin;
    }

    @JsonProperty("maritas_sts")
    public Integer getMaritasSts() {
        return maritasSts;
    }

    @JsonProperty("maritas_sts")
    public void setMaritasSts(Integer maritasSts) {
        this.maritasSts = maritasSts;
    }

    @JsonProperty("jns_debitur")
    public String getJnsDebitur() {
        return jnsDebitur;
    }

    @JsonProperty("jns_debitur")
    public void setJnsDebitur(String jnsDebitur) {
        this.jnsDebitur = jnsDebitur;
    }

    @JsonProperty("kode_kabkota")
    public String getKodeKabkota() {
        return kodeKabkota;
    }

    @JsonProperty("kode_kabkota")
    public void setKodeKabkota(String kodeKabkota) {
        this.kodeKabkota = kodeKabkota;
    }

    @JsonProperty("kode_pos")
    public String getKodePos() {
        return kodePos;
    }

    @JsonProperty("kode_pos")
    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    @JsonProperty("mulai_usaha")
    public String getMulaiUsaha() {
        return mulaiUsaha;
    }

    @JsonProperty("mulai_usaha")
    public void setMulaiUsaha(String mulaiUsaha) {
        this.mulaiUsaha = mulaiUsaha;
    }

    @JsonProperty("alamat_usaha")
    public String getAlamatUsaha() {
        return alamatUsaha;
    }

    @JsonProperty("alamat_usaha")
    public void setAlamatUsaha(String alamatUsaha) {
        this.alamatUsaha = alamatUsaha;
    }

    @JsonProperty("ijin_usaha")
    public String getIjinUsaha() {
        return ijinUsaha;
    }

    @JsonProperty("ijin_usaha")
    public void setIjinUsaha(String ijinUsaha) {
        this.ijinUsaha = ijinUsaha;
    }

    @JsonProperty("modal_usaha")
    public BigDecimal getModalUsaha() {
        return modalUsaha;
    }

    @JsonProperty("modal_usaha")
    public void setModalUsaha(BigDecimal modalUsaha) {
        this.modalUsaha = modalUsaha;
    }

    @JsonProperty("jml_pekerja")
    public Integer getJmlPekerja() {
        return jmlPekerja;
    }

    @JsonProperty("jml_pekerja")
    public void setJmlPekerja(Integer jmlPekerja) {
        this.jmlPekerja = jmlPekerja;
    }

    @JsonProperty("no_hp")
    public String getNoHp() {
        return noHp;
    }

    @JsonProperty("no_hp")
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    @JsonProperty("uraian_agunan")
    public String getUraianAgunan() {
        return uraianAgunan;
    }

    @JsonProperty("uraian_agunan")
    public void setUraianAgunan(String uraianAgunan) {
        this.uraianAgunan = uraianAgunan;
    }

    @JsonProperty("omset")
    public Object getOmset() {
        return omset;
    }

    @JsonProperty("omset")
    public void setOmset(Object omset) {
        this.omset = omset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}