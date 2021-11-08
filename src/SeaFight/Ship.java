package SeaFight;

public class Ship {
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int shipSize;

    public Ship(int i, int j) {
        this.i = i;
        this.j = j;
        shipSize=1;

    }

    public Ship(int i, int j, int k, int l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        shipSize = 2;
    }

    public Ship(int i, int j, int k, int l, int m, int n) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        shipSize = 3;
    }

    public Ship(int i, int j, int k, int l, int m, int n, int o, int p) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p;
        shipSize = 4;
    }

    public int[] coordinates () {
        int[] massive = new int[0];
        switch (shipSize) {
            case 1:
                massive = new int[]{i, j};
                //return massive;
            break;
            case 2:
                massive = new int[]{i, j, k, l};
                //return massive;
            break;
            case 3:
                massive = new int[]{i, j, k, l, m, n};
                //return massive;
            break;
            case 4:
                massive = new int[]{i, j, k, l, m, n, o, p};
                //return massive;
            break;
            default:
        }
        return massive;
    }

}
