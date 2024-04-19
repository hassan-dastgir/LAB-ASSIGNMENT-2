import java.util.Objects;

public class Pc implements Comparable<Pc>{

    //instance variables
    private String name;
    private int id;
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;


    Pc(){}
    //constructors
    public Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu, String name) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
        this.name = name;
    }

    public Pc(Pc p){
        this.id = p.id;
        this.cpu = p.cpu;
        this.ram = p.ram;
        this.storage = p.storage;
        this.lcdMaker = p.lcdMaker;
        this.hasGpu = p.hasGpu;
        this.name = p.name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLcdMaker() {
        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {
        this.lcdMaker = lcdMaker;
    }

    public boolean getHasGpu() {
        return hasGpu;
    }

    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //methods
    @Override
    public String toString() {
        return String.format("Name: %s\nId: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n",
                name, id, cpu, ram, storage, lcdMaker, hasGpu);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pc p = (Pc)o;

        return id == p.id &&
                hasGpu == p.hasGpu &&
                Objects.equals(cpu, p.cpu) &&
                Objects.equals(ram, p.ram) &&
                Objects.equals(storage, p.storage) &&
                Objects.equals(lcdMaker, p.lcdMaker) &&
                Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, cpu, ram, storage, lcdMaker, hasGpu);
    }

    @Override
    public int compareTo(Pc other) {
        return this.name.compareTo(other.getName());
    }
}
