public class DiasLluvia {
    private boolean [][] calendario;

    public DiasLluvia() {
        this.calendario = new boolean[12][31];

    }

    public boolean registroDia(int dia, int mes, boolean haLlovido){

        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            System.err.println("DIA REGISTRADO");
            if (haLlovido) {
                System.out.println("DIA DE LLUVIA");
                this.calendario[mes][dia] = haLlovido;
            }else if (!haLlovido){
                System.out.println("DIA NO HA LLUVIA");
                this.calendario[mes][dia] = haLlovido;
            }
        }else{
            haLlovido = false;
            System.err.println("DIA NO REGISTRADO");
        }
        return haLlovido;
    }

    public boolean consultarDia(int dia, int mes){
        boolean llovio = false;
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if (calendario[mes][dia]) {
                llovio = true;
            }
        }else{
            System.err.println("DIA NO REGISTRADO");
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

    /*public int trimestraLluviosa(){
        int [] trimestre = new int[calendario.length/4];

        for (int i = 0; i < trimestre.length; i++) {
            for (int j = 0; j < calendario.length; j++) {
                for (int k = 0; k < calendario[j].length; k++) {
                    if (calendario[i][j]) {
                        total++;
                    }
                }
            }
        }
    }*/

    public int primerDiaLluvia(){
        int dia = 1;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (!calendario[i][j]) {
                    dia++;
                }else{
                    break;
                }
            }
        }
        return dia;
    }
}
