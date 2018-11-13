import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class SecondEntity {

	@Basic private Boolean dirty;

	public boolean isDirty() {
		return dirty != null && dirty;
	}

	public boolean getDirty() {
		return isDirty();
	}
}
