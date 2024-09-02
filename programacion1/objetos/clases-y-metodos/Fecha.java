public class Fecha {

    int dia;
    int mes;
    int anio;

    Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0) {
            return true;
        } else if (anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int diasDelMes(int mes, int anio) {
        if (mes == 2 && esBisiesto(anio)) {
            return 29;
        } else {
            int[] diasDeCadaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            return diasDeCadaMes[mes - 1];
        }
    }

    public boolean esValida() {
        if (this.mes == 2 && esBisiesto(this.anio) && this.dia == 29) {
            return true;
        }

        int[] diasDeCadaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int diasDeEsteMes = diasDeCadaMes[this.mes - 1];

        if (this.dia >= 1 && this.dia <= diasDeEsteMes) {
            return true;
        }
        return false;
    }

    public void avanzarDia() {
        int[] diasDeCadaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int diasDeEsteMes = diasDeCadaMes[this.mes - 1];

        if (this.mes == 12 && this.dia == 31) {
            this.anio += 1;
            this.mes = 1;
            this.dia = 1;
        } else if (this.mes == 2 && esBisiesto(anio) && this.dia == 29) {
            this.mes = 3;
            this.dia = 1;
        } else if (!(esBisiesto(diasDeEsteMes)) && this.dia == diasDeEsteMes) {
            this.mes += 1;
            this.dia = 1;
        } else {
            this.dia += 1;
        }
    }

    public boolean antesQue(Fecha otra) {
        if (otra.anio > this.anio) {
            return true;
        } else if (otra.mes > this.mes) {
            return true;
        } else if (otra.dia > this.dia) {
            return true;
        } else {
            return false;
        }
    }

    public int diaDelAnio() {
        int numeroDelDia = 0;
        int[] diasDeCadaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < diasDeCadaMes.length; i++) {
            if (this.mes == i + 1) {
                break;
            }

            numeroDelDia += diasDeCadaMes[i];
        }

        numeroDelDia += this.dia;

        if (esBisiesto(this.anio) && this.mes > 2) {
            numeroDelDia++;
        }

        return numeroDelDia;
    }

    public int diasDeDiferenciaCon(Fecha otra) {
        int diasDeDiferencia = this.diaDelAnio() - otra.diaDelAnio();

        if (diasDeDiferencia < 0) {
            return diasDeDiferencia * -1;
        }
        return diasDeDiferencia;
    }
}