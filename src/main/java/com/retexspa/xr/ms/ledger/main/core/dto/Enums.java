package com.retexspa.xr.ms.ledger.main.core.dto;

public class Enums extends com.retexspa.xr.ms.main.core.dto.Enums  {
    public enum VariazioneFondoCasssa {
        A,
        D,
        S,
        N
    }
    public enum SegnoModificaVenduto {
        P,
        N
    }

    public enum Segno {
        PLUS("+"),
        MINUS("-");
        private final String symbol;
        Segno(String symbol) {
            this.symbol = symbol;
        }
        public String getSymbol() {
            return symbol;
        }
        @Override
        public String toString() {
            return this.symbol;
        }
    }
    public enum PadDir {
        L,
        R
    }
    public enum TipoField{
    C,
    N,
    D
    }

    public enum TipoMoneta{
    B, M
    }
}
