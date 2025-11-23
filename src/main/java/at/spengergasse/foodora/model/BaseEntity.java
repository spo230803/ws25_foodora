package at.spengergasse.foodora.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Override
    public boolean equals(Object o)
    {
        if(o == null || getClass() != o.getClass()){return  false;}
        BaseEntity other = (BaseEntity)o;

        if(istTransient()) {return false;}
        return Objects.equals(id, other.id);
    }//equals

    public boolean istTransient(){
        return this.id == null;
    }

    @Override
    public String toString()
    {
        return  String.valueOf(this.id);
    }

}//end Class
