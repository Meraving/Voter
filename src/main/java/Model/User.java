package Model;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public class User extends AbstractNamedEntity{

    private String password;
    private Set<Role> roles;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
//        this.roles = CollectionUtils.isEmpty(roles) ? EnumSet.noneOf(Role.class) : EnumSet.copyOf(roles);
    }

    public User() {
    }

    public User (Integer id, String name, String password, Collection<Role> roles){

       super(id, name);
        this.password = password;
        setRoles(roles);

    }
    public User (User u){
        this(u.getId(), u.name, u.getPassword(), u.getRoles());
    }

}
