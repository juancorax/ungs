// Ejercicio 12

import java.util.ArrayList;
import java.util.LinkedList;

public class Modulo7 {

    private Laboratorio[] labos;

    public Modulo7(int cantidadDeLabos) {
        this.labos = new Laboratorio[cantidadDeLabos];
    }

    public Laboratorio[] getLabos() {
        return labos;
    }

    // a)
    public LinkedList<Componente> componentesPorMarca(Marca marca) {
        LinkedList<Componente> componentes = new LinkedList<>();

        for (Laboratorio laboratorio : labos) {
            for (PC pc : laboratorio.getComputadoras()) {
                for (Componente componente : pc.getComponentes()) {
                    if (!(componentes.contains(componente))
                            && componente.getMarca() == marca) {
                        componentes.add(componente);
                    }
                }
            }
        }

        return componentes;
    }

    // b)
    public int pcsConMinimaCalidad() {
        int cantidadDePcs = 0;

        for (Laboratorio laboratorio : labos) {
            for (PC pc : laboratorio.getComputadoras()) {
                boolean minimaCalidad = true;

                for (Componente componente : pc.getComponentes()) {
                    if (componente.getMarca().getCalidad() != 1) {
                        minimaCalidad = false;
                    }
                }

                if (minimaCalidad) {
                    cantidadDePcs++;
                }
            }
        }

        return cantidadDePcs;
    }

    // c)
    public boolean gamaAlta() {
        for (Laboratorio laboratorio : labos) {
            for (PC pc : laboratorio.getComputadoras()) {
                boolean gamaAlta = true;

                for (Componente componente : pc.getComponentes()) {
                    if (componente.getMarca().getCalidad() < 4) {
                        gamaAlta = false;
                    }
                }

                if (gamaAlta) {
                    return true;
                }
            }
        }

        return false;
    }

    // d)
    public LinkedList<PC> pcCompuestasPor(Marca[] ciertasMarcas) {
        LinkedList<PC> pcs = new LinkedList<>();

        for (Laboratorio laboratorio : labos) {
            for (PC pc : laboratorio.getComputadoras()) {
                int componentesCuyaMarcaPertenece = 0;

                for (Componente componente : pc.getComponentes()) {
                    for (Marca marca : ciertasMarcas) {
                        if (marca == componente.getMarca()) {
                            componentesCuyaMarcaPertenece++;
                            break;
                        }
                    }
                }

                if (componentesCuyaMarcaPertenece == pc.getComponentes().length) {
                    pcs.add(pc);
                }
            }
        }

        return pcs;
    }

    // e)
    public Marca marcaMasUsada() {
        ArrayList<Marca> marcas = new ArrayList<>();
        ArrayList<Integer> cantidadDeCadaMarca = new ArrayList<>();

        for (Laboratorio laboratorio : labos) {
            for (PC pc : laboratorio.getComputadoras()) {
                for (Componente componente : pc.getComponentes()) {
                    if (marcas.contains(componente.getMarca())) {
                        for (int i = 0; i < marcas.size(); i++) {
                            if (marcas.get(i) == componente.getMarca()) {
                                cantidadDeCadaMarca.set(i, cantidadDeCadaMarca.get(i) + 1);
                            }
                        }
                    } else {
                        marcas.add(componente.getMarca());
                        cantidadDeCadaMarca.add(1);
                    }
                }
            }
        }

        Marca marcaQueMasProvee = marcas.get(0);
        int mayorCantidad = 0;

        for (int i = 0; i < marcas.size(); i++) {
            if (cantidadDeCadaMarca.get(i) > mayorCantidad) {
                marcaQueMasProvee = marcas.get(i);
                mayorCantidad = cantidadDeCadaMarca.get(i);
            }
        }

        return marcaQueMasProvee;
    }
}
