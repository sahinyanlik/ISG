package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by mtrcm021 on 09/26/2014.
 * sy
 */
@Entity
public class Bolge extends Model {

    @Id
    public int bolgeId;
    public String bolgeName;

    public User olusturan;
    @OneToMany
    public Birim birileri;

}
