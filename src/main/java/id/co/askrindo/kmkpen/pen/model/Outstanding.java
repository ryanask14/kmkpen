package id.co.askrindo.kmkpen.pen.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Data
public class Outstanding {

    private String tanggalSaldo;

    private BigDecimal outstanding;

    private BigDecimal angsuranPokok;

    private BigDecimal angsuranBunga;

    private BigDecimal angsuranDenda;
}
