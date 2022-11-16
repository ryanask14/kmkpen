package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kodeBank",
        "nomorAplikasi",
        "kodeUker",
        "namaUker",
        "noRekening",
        "noRekLama",
        "cif",
        "noPk",
        "tglPK",
        "tanggalAwal",
        "tanggalAkhir",
        "jangkaWaktu",
        "namaDebitur",
        "alamatDebitur",
        "kodePos",
        "tempatLahir",
        "tanggalLahir",
        "jenisKelamin",
        "noTelepon",
        "noHp",
        "noIdentitas",
        "npwp",
        "pendidikan",
        "maritalStatus",
        "jenisIdentitas",
        "noIjinUsaha",
        "tglMulaiUsaha",
        "modalUsaha",
        "jumlahTenagaKerja",
        "omsetUsaha",
        "kekayaanBersih",
        "kodePekerjaan",
        "statusKepegawaian",
        "jenisKredit",
        "plafonKredit",
        "typeTujuanKredit",
        "sukuBunga",
        "kodeSektor",
        "coverage",
        "statusKolektibilitas",
        "loanType",
        "statusAkad",
        "plafonKreditLama",
        "noSertifikatLama",
        "listAgunan",
        "listOutstanding"
})
@Generated("jsonschema2pojo")
public class CoveringValidationRequest {

    @JsonProperty("kodeBank")
    private String kodeBank;
    @JsonProperty("nomorAplikasi")
    private String nomorAplikasi;
    @JsonProperty("kodeUker")
    private String kodeUker;
    @JsonProperty("namaUker")
    private String namaUker;
    @JsonProperty("noRekening")
    private String noRekening;
    @JsonProperty("noRekLama")
    private String noRekLama;
    @JsonProperty("cif")
    private String cif;
    @JsonProperty("noPk")
    private String noPk;
    @JsonProperty("tglPK")
    private String tglPK;
    @JsonProperty("tanggalAwal")
    private String tanggalAwal;
    @JsonProperty("tanggalAkhir")
    private String tanggalAkhir;
    @JsonProperty("jangkaWaktu")
    private Integer jangkaWaktu;
    @JsonProperty("namaDebitur")
    private String namaDebitur;
    @JsonProperty("alamatDebitur")
    private String alamatDebitur;
    @JsonProperty("kodePos")
    private String kodePos;
    @JsonProperty("tempatLahir")
    private String tempatLahir;
    @JsonProperty("tanggalLahir")
    private Date tanggalLahir;
    @JsonProperty("jenisKelamin")
    private Integer jenisKelamin;
    @JsonProperty("noTelepon")
    private String noTelepon;
    @JsonProperty("noHp")
    private String noHp;
    @JsonProperty("noIdentitas")
    private String noIdentitas;
    @JsonProperty("npwp")
    private String npwp;
    @JsonProperty("pendidikan")
    private Integer pendidikan;
    @JsonProperty("maritalStatus")
    private Integer maritalStatus;
    @JsonProperty("jenisIdentitas")
    private String jenisIdentitas;
    @JsonProperty("noIjinUsaha")
    private String noIjinUsaha;
    @JsonProperty("tglMulaiUsaha")
    private String tglMulaiUsaha;
    @JsonProperty("modalUsaha")
    private BigDecimal modalUsaha;
    @JsonProperty("jumlahTenagaKerja")
    private Integer jumlahTenagaKerja;
    @JsonProperty("omsetUsaha")
    private BigDecimal omsetUsaha;
    @JsonProperty("kekayaanBersih")
    private Integer kekayaanBersih;
    @JsonProperty("kodePekerjaan")
    private Integer kodePekerjaan;
    @JsonProperty("statusKepegawaian")
    private String statusKepegawaian;
    @JsonProperty("jenisKredit")
    private String jenisKredit;
    @JsonProperty("plafonKredit")
    private BigDecimal plafonKredit;
    @JsonProperty("typeTujuanKredit")
    private String typeTujuanKredit;
    @JsonProperty("sukuBunga")
    private String sukuBunga;
    @JsonProperty("kodeSektor")
    private String kodeSektor;
    @JsonProperty("coverage")
    private Integer coverage;
    @JsonProperty("statusKolektibilitas")
    private String statusKolektibilitas;
    @JsonProperty("loanType")
    private String loanType;
    @JsonProperty("statusAkad")
    private String statusAkad;
    @JsonProperty("plafonKreditLama")
    private BigDecimal plafonKreditLama;
    @JsonProperty("noSertifikatLama")
    private String noSertifikatLama;
    @JsonProperty("listAgunan")
    private List<ListAgunan> listAgunan = null;
    @JsonProperty("listOutstanding")
    private List<ListOutstanding> listOutstanding = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kodeBank")
    public String getKodeBank() {
        return kodeBank;
    }

    @JsonProperty("kodeBank")
    public void setKodeBank(String kodeBank) {
        this.kodeBank = kodeBank;
    }

    @JsonProperty("nomorAplikasi")
    public String getNomorAplikasi() {
        return nomorAplikasi;
    }

    @JsonProperty("nomorAplikasi")
    public void setNomorAplikasi(String nomorAplikasi) {
        this.nomorAplikasi = nomorAplikasi;
    }

    @JsonProperty("kodeUker")
    public String getKodeUker() {
        return kodeUker;
    }

    @JsonProperty("kodeUker")
    public void setKodeUker(String kodeUker) {
        this.kodeUker = kodeUker;
    }

    @JsonProperty("namaUker")
    public String getNamaUker() {
        return namaUker;
    }

    @JsonProperty("namaUker")
    public void setNamaUker(String namaUker) {
        this.namaUker = namaUker;
    }

    @JsonProperty("noRekening")
    public String getNoRekening() {
        return noRekening;
    }

    @JsonProperty("noRekening")
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    @JsonProperty("noRekLama")
    public String getNoRekLama() {
        return noRekLama;
    }

    @JsonProperty("noRekLama")
    public void setNoRekLama(String noRekLama) {
        this.noRekLama = noRekLama;
    }

    @JsonProperty("cif")
    public String getCif() {
        return cif;
    }

    @JsonProperty("cif")
    public void setCif(String cif) {
        this.cif = cif;
    }

    @JsonProperty("noPk")
    public String getNoPk() {
        return noPk;
    }

    @JsonProperty("noPk")
    public void setNoPk(String noPk) {
        this.noPk = noPk;
    }

    @JsonProperty("tglPK")
    public String getTglPK() {
        return tglPK;
    }

    @JsonProperty("tglPK")
    public void setTglPK(String tglPK) {
        this.tglPK = tglPK;
    }

    @JsonProperty("tanggalAwal")
    public String getTanggalAwal() {
        return tanggalAwal;
    }

    @JsonProperty("tanggalAwal")
    public void setTanggalAwal(String tanggalAwal) {
        this.tanggalAwal = tanggalAwal;
    }

    @JsonProperty("tanggalAkhir")
    public String getTanggalAkhir() {
        return tanggalAkhir;
    }

    @JsonProperty("tanggalAkhir")
    public void setTanggalAkhir(String tanggalAkhir) {
        this.tanggalAkhir = tanggalAkhir;
    }

    @JsonProperty("jangkaWaktu")
    public Integer getJangkaWaktu() {
        return jangkaWaktu;
    }

    @JsonProperty("jangkaWaktu")
    public void setJangkaWaktu(Integer jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    @JsonProperty("namaDebitur")
    public String getNamaDebitur() {
        return namaDebitur;
    }

    @JsonProperty("namaDebitur")
    public void setNamaDebitur(String namaDebitur) {
        this.namaDebitur = namaDebitur;
    }

    @JsonProperty("alamatDebitur")
    public String getAlamatDebitur() {
        return alamatDebitur;
    }

    @JsonProperty("alamatDebitur")
    public void setAlamatDebitur(String alamatDebitur) {
        this.alamatDebitur = alamatDebitur;
    }

    @JsonProperty("kodePos")
    public String getKodePos() {
        return kodePos;
    }

    @JsonProperty("kodePos")
    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    @JsonProperty("tempatLahir")
    public String getTempatLahir() {
        return tempatLahir;
    }

    @JsonProperty("tempatLahir")
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    @JsonProperty("tanggalLahir")
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    @JsonProperty("tanggalLahir")
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    @JsonProperty("jenisKelamin")
    public Integer getJenisKelamin() {
        return jenisKelamin;
    }

    @JsonProperty("jenisKelamin")
    public void setJenisKelamin(Integer jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @JsonProperty("noTelepon")
    public String getNoTelepon() {
        return noTelepon;
    }

    @JsonProperty("noTelepon")
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    @JsonProperty("noHp")
    public String getNoHp() {
        return noHp;
    }

    @JsonProperty("noHp")
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    @JsonProperty("noIdentitas")
    public String getNoIdentitas() {
        return noIdentitas;
    }

    @JsonProperty("noIdentitas")
    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    @JsonProperty("npwp")
    public String getNpwp() {
        return npwp;
    }

    @JsonProperty("npwp")
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @JsonProperty("pendidikan")
    public Integer getPendidikan() {
        return pendidikan;
    }

    @JsonProperty("pendidikan")
    public void setPendidikan(Integer pendidikan) {
        this.pendidikan = pendidikan;
    }

    @JsonProperty("maritalStatus")
    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("maritalStatus")
    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @JsonProperty("jenisIdentitas")
    public String getJenisIdentitas() {
        return jenisIdentitas;
    }

    @JsonProperty("jenisIdentitas")
    public void setJenisIdentitas(String jenisIdentitas) {
        this.jenisIdentitas = jenisIdentitas;
    }

    @JsonProperty("noIjinUsaha")
    public String getNoIjinUsaha() {
        return noIjinUsaha;
    }

    @JsonProperty("noIjinUsaha")
    public void setNoIjinUsaha(String noIjinUsaha) {
        this.noIjinUsaha = noIjinUsaha;
    }

    @JsonProperty("tglMulaiUsaha")
    public String getTglMulaiUsaha() {
        return tglMulaiUsaha;
    }

    @JsonProperty("tglMulaiUsaha")
    public void setTglMulaiUsaha(String tglMulaiUsaha) {
        this.tglMulaiUsaha = tglMulaiUsaha;
    }

    @JsonProperty("modalUsaha")
    public BigDecimal getModalUsaha() {
        return modalUsaha;
    }

    @JsonProperty("modalUsaha")
    public void setModalUsaha(BigDecimal modalUsaha) {
        this.modalUsaha = modalUsaha;
    }

    @JsonProperty("jumlahTenagaKerja")
    public Integer getJumlahTenagaKerja() {
        return jumlahTenagaKerja;
    }

    @JsonProperty("jumlahTenagaKerja")
    public void setJumlahTenagaKerja(Integer jumlahTenagaKerja) {
        this.jumlahTenagaKerja = jumlahTenagaKerja;
    }

    @JsonProperty("omsetUsaha")
    public BigDecimal getOmsetUsaha() {
        return omsetUsaha;
    }

    @JsonProperty("omsetUsaha")
    public void setOmsetUsaha(BigDecimal omsetUsaha) {
        this.omsetUsaha = omsetUsaha;
    }

    @JsonProperty("kekayaanBersih")
    public Integer getKekayaanBersih() {
        return kekayaanBersih;
    }

    @JsonProperty("kekayaanBersih")
    public void setKekayaanBersih(Integer kekayaanBersih) {
        this.kekayaanBersih = kekayaanBersih;
    }

    @JsonProperty("kodePekerjaan")
    public Integer getKodePekerjaan() {
        return kodePekerjaan;
    }

    @JsonProperty("kodePekerjaan")
    public void setKodePekerjaan(Integer kodePekerjaan) {
        this.kodePekerjaan = kodePekerjaan;
    }

    @JsonProperty("statusKepegawaian")
    public String getStatusKepegawaian() {
        return statusKepegawaian;
    }

    @JsonProperty("statusKepegawaian")
    public void setStatusKepegawaian(String statusKepegawaian) {
        this.statusKepegawaian = statusKepegawaian;
    }

    @JsonProperty("jenisKredit")
    public String getJenisKredit() {
        return jenisKredit;
    }

    @JsonProperty("jenisKredit")
    public void setJenisKredit(String jenisKredit) {
        this.jenisKredit = jenisKredit;
    }

    @JsonProperty("plafonKredit")
    public BigDecimal getPlafonKredit() {
        return plafonKredit;
    }

    @JsonProperty("plafonKredit")
    public void setPlafonKredit(BigDecimal plafonKredit) {
        this.plafonKredit = plafonKredit;
    }

    @JsonProperty("typeTujuanKredit")
    public String getTypeTujuanKredit() {
        return typeTujuanKredit;
    }

    @JsonProperty("typeTujuanKredit")
    public void setTypeTujuanKredit(String typeTujuanKredit) {
        this.typeTujuanKredit = typeTujuanKredit;
    }

    @JsonProperty("sukuBunga")
    public String getSukuBunga() {
        return sukuBunga;
    }

    @JsonProperty("sukuBunga")
    public void setSukuBunga(String sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    @JsonProperty("kodeSektor")
    public String getKodeSektor() {
        return kodeSektor;
    }

    @JsonProperty("kodeSektor")
    public void setKodeSektor(String kodeSektor) {
        this.kodeSektor = kodeSektor;
    }

    @JsonProperty("coverage")
    public Integer getCoverage() {
        return coverage;
    }

    @JsonProperty("coverage")
    public void setCoverage(Integer coverage) {
        this.coverage = coverage;
    }

    @JsonProperty("statusKolektibilitas")
    public String getStatusKolektibilitas() {
        return statusKolektibilitas;
    }

    @JsonProperty("statusKolektibilitas")
    public void setStatusKolektibilitas(String statusKolektibilitas) {
        this.statusKolektibilitas = statusKolektibilitas;
    }

    @JsonProperty("loanType")
    public String getLoanType() {
        return loanType;
    }

    @JsonProperty("loanType")
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("statusAkad")
    public String getStatusAkad() {
        return statusAkad;
    }

    @JsonProperty("statusAkad")
    public void setStatusAkad(String statusAkad) {
        this.statusAkad = statusAkad;
    }

    @JsonProperty("plafonKreditLama")
    public BigDecimal getPlafonKreditLama() {
        return plafonKreditLama;
    }

    @JsonProperty("plafonKreditLama")
    public void setPlafonKreditLama(BigDecimal plafonKreditLama) {
        this.plafonKreditLama = plafonKreditLama;
    }

    @JsonProperty("noSertifikatLama")
    public String getNoSertifikatLama() {
        return noSertifikatLama;
    }

    @JsonProperty("noSertifikatLama")
    public void setNoSertifikatLama(String noSertifikatLama) {
        this.noSertifikatLama = noSertifikatLama;
    }

    @JsonProperty("listAgunan")
    public List<ListAgunan> getListAgunan() {
        return listAgunan;
    }

    @JsonProperty("listAgunan")
    public void setListAgunan(List<ListAgunan> listAgunan) {
        this.listAgunan = listAgunan;
    }

    @JsonProperty("listOutstanding")
    public List<ListOutstanding> getListOutstanding() {
        return listOutstanding;
    }

    @JsonProperty("listOutstanding")
    public void setListOutstanding(List<ListOutstanding> listOutstanding) {
        this.listOutstanding = listOutstanding;
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

