package Model;

public abstract class AbstractBaseEntity {

    public static final int START_SEQ = 100000;

    protected Integer id;

    protected AbstractBaseEntity() {
    }

    protected AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

     public int id() {
        return id;
    }

    public boolean isNew() {
        return this.id == null;
    }

}
