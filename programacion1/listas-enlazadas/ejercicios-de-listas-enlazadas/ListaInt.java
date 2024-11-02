public class ListaInt {

    private NodoInt primero;

    public ListaInt() {
        this.primero = null;
    }

    // 1
    public void agregarAdelante(int e) {
        NodoInt nuevo = new NodoInt(e);

        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            nuevo.siguiente = this.primero;

            this.primero = nuevo;
        }
    }

    // 2
    public void imprimir() {
        System.out.print("[");

        NodoInt actual = this.primero;

        while (actual != null) {
            if (actual.siguiente == null) {
                System.out.print(actual.elemento + "");
            } else {
                System.out.print(actual.elemento + ", ");
            }
            actual = actual.siguiente;
        }

        System.out.println("]");
    }

    // 3
    public int largo() {
        int cantidad = 0;

        NodoInt actual = this.primero;

        while (actual != null) {
            cantidad++;

            actual = actual.siguiente;
        }

        return cantidad;
    }

    // 4
    public void agregarAtras(int e) {
        NodoInt nuevo = new NodoInt(e);

        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            NodoInt actual = this.primero;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    // 5
    public boolean pertenece(int e) {
        NodoInt actual = this.primero;

        while (actual != null) {
            if (actual.elemento == e) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    // 6
    public int iesimo(int pos) {
        if (pos < 0 || pos > (this.largo() - 1)) {
            throw new IndexOutOfBoundsException("Posicion Invalida");
        }

        NodoInt actual = this.primero;
        int posicionActual = 0;

        while (actual != null) {
            if (posicionActual == pos) {
                break;
            }

            actual = actual.siguiente;
            posicionActual++;
        }

        return actual.elemento;
    }

    // 7
    public void quitar(int e) {
        NodoInt anterior = null;
        NodoInt actual = this.primero;

        while (actual != null) {
            if (actual.elemento == e) {
                if (anterior == null) {
                    this.primero = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }
    }

    // 8
    public void quitarTodos(int e) {
        NodoInt anterior = null;
        NodoInt actual = this.primero;

        while (actual != null) {
            if (actual.elemento == e) {
                if (anterior == null) {
                    this.primero = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
            }

            anterior = actual;
            actual = actual.siguiente;
        }
    }

    // 9
    public void recortarDesde(int k) {
        if (k == 0) {
            this.primero = null;
            return;
        } else if (k < 0 || k > (this.largo() - 1)) {
            throw new IndexOutOfBoundsException("Posicion Invalida");
        }

        NodoInt actual = this.primero;
        int posicionActual = 0;

        while (actual != null) {
            if (posicionActual + 1 == k) {
                break;
            }

            actual = actual.siguiente;
            posicionActual++;
        }

        actual.siguiente = null;
    }

    // 10
    public void recortarHasta(int k) {
        if (k < 0 || k > (this.largo() - 1)) {
            throw new IndexOutOfBoundsException("Posicion Invalida");
        }

        NodoInt actual = this.primero;
        int posicionActual = 0;

        while (actual != null) {
            if (posicionActual == k) {
                break;
            }

            actual = actual.siguiente;
            posicionActual++;
        }

        this.primero = actual.siguiente;
    }

    // 11
    public ListaInt sublista(int desde, int hasta) {
        if (desde < 0 || desde > (this.largo() - 1) || hasta < 0 || hasta > (this.largo() - 1)) {
            throw new IndexOutOfBoundsException("Posicion Invalida");
        }

        ListaInt nuevaLista = new ListaInt();

        NodoInt actual = this.primero;
        int posicionActual = 0;

        while (actual != null) {
            if (desde <= posicionActual && posicionActual <= hasta) {
                nuevaLista.agregarAtras(actual.elemento);
            }

            actual = actual.siguiente;
            posicionActual++;
        }

        return nuevaLista;
    }

    // 12
    public void quitarDuplicado() {
        ListaInt nuevaLista = new ListaInt();

        NodoInt actual = this.primero;

        while (actual != null) {
            if (!(nuevaLista.pertenece(actual.elemento))) {
                nuevaLista.agregarAtras(actual.elemento);
            }

            actual = actual.siguiente;
        }

        this.primero = nuevaLista.primero;
    }

    // 13
    public void quitarPrimero() {
        if (this.primero == null) {
            return;
        } else if (this.largo() == 1) {
            this.primero = null;
        } else {
            this.primero = this.primero.siguiente;
        }
    }

    // 14
    public int primero() {
        if (this.primero == null) {
            throw new IllegalStateException("La lista esta vacia.");
        }

        return this.primero.elemento;
    }

    // 15
    public void insertarOrdenado(int e) {
        NodoInt actual = this.primero;

        if (e < actual.elemento) {
            this.agregarAdelante(e);

            return;
        }

        while (actual.siguiente != null) {
            if (actual.elemento < e && e < actual.siguiente.elemento) {
                NodoInt nuevoNodo = new NodoInt(e);

                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;

                return;
            }

            actual = actual.siguiente;
        }

        this.agregarAtras(e);
    }

    // 16
    public void insertarEnPosicion(int e, int p) {
        if (p == 0) {
            this.agregarAdelante(e);

            return;
        } else if (p < 0 || p > (this.largo() - 1)) {
            throw new IndexOutOfBoundsException("Posicion Invalida");
        }

        NodoInt actual = this.primero;
        int posicionActual = 0;

        while (actual != null) {
            if (posicionActual + 1 == p) {
                NodoInt nuevoNodo = new NodoInt(e);

                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;

                return;
            }

            actual = actual.siguiente;
            posicionActual++;
        }
    }
}