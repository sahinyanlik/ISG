package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

/**
 * Created by mtrcm021 on 09/26/2014.
 * sy
 */
@Entity
public class Sirket extends Model {
    @Id
    public int id;
    public String sirketAdi;
    public String sirketUnvani;
    public int olusuranKisi;
    public Date olusturulmaTarihi;
    @OneToMany
    public Bolge bolgeleri;

}
