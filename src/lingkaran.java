class lingkaran extends bangundatar {
    private double jarijari;
    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    @Override
    public double luas() {
        return Math.PI * jarijari * jarijari;
    }
    @Override
    public double keliling() {
        return 2 * Math.PI * jarijari;
    }
}