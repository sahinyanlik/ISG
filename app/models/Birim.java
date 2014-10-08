package models;

import play.data.format.Formats;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by mtrcm021 on 09/26/2014.
 * sy
 */

@Entity
public class Birim  extends Model {

    @Id
    public int birimId;
    public String birimAdi;
    public User birimiOlusturan;
    public String birimAdresi;
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();



    public static Finder<Long,Birim> find = new Finder<Long,Birim>(
            Long.class, Birim.class
    );


}
