public class Notebook {
    private int memory;
    private int disk;
    private String os;
    private String color;
    
    
    public Notebook(int memory, int disk, String os, String color) {
        this.memory = memory;
        this.disk = disk;
        this.os = os;
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + memory;
        result = prime * result + disk;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (memory != other.memory)
            return false;
        if (disk != other.disk)
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Notebook [memory=" + memory + ", disk=" + disk + ", os=" + os + ", color=" + color + "]";
    }

    public int getMemory() {
        return memory;
    }

    public int getDisk() {
        return disk;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}
