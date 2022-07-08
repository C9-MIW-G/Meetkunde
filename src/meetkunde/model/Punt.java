package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Een punt in de 2D ruimte
 */
public class Punt {
    public static final int DEFAULT_X_COORDINAAT = 0;
    public static final int DEFAULT_Y_COORDINAAT = 0;

    private final double xCoordinaat;
    private final double yCoordinaat;

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }

    public Punt() {
        this(DEFAULT_X_COORDINAAT, DEFAULT_Y_COORDINAAT);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", this.xCoordinaat, this.yCoordinaat);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }
}
