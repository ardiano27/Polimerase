class persegi extends bangundatar {
    private int sisi;
    public persegi(int sisi) {
        this.sisi = sisi;
    }
    @Override
    public double luas() {
        return sisi * sisi;
    } 
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}