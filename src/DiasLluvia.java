public class DiasLluvia {
    private boolean [][] calendario;

    public DiasLluvia() {
        this.calendario = new boolean[12][31];

    }

    public boolean registroDia(int dia, int mes, boolean haLlovido){

        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if (haLlovido) {
                this.calendario[mes-1][dia-1] = haLlovido;
            }else if (!haLlovido){
                this.calendario[mes-1][dia-1] = haLlovido;
            }
        }else{
            haLlovido = false;
        }
        return haLlovido;
    }

    public boolean consultarDia(int dia, int mes){
        boolean llovio = false;
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if (calendario[mes-1][dia-1]) {
                llovio = true;
            }
        }
        return llovio;
    }

    public int contarDiasLluvias(){
        int total = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    total++;
                }
            }
        }
        return total;
    }

    public int trimestraLluviosa(){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

            for (int j = 0; j < calendario.length; j++) {
                for (int k = 0; k < calendario[j].length; k++) {
                    if ((j >= 0 && j <= 2) && calendario[j][k]) {
                        cont1++;
                    }else if ((j >= 3 && j <= 5) && calendario[j][k]) {
                        cont2++;
                    }else if ((j >= 6 && j <= 8) && calendario[j][k]) {
                        cont3++;
                    }else if ((j >= 9 && j <= 12) && calendario[j][k]) {
                        cont4++;
                    }
                }
            }

        if (cont1 > cont2 && cont1 > cont3 && cont1 > cont4) {
            return 1;
        }else if (cont2 > cont3 && cont2 > cont4) {
            return 2;
        }else if (cont3 > cont4) {
            return 3;
        }else{
            return 4;
        }
    }

    public int primerDiaLluvia(){
        int dia = 1;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (!calendario[i][j]) {
                    dia++;
                }else {
                    return dia;
                }
            }
        }
        return dia;
    }
}
