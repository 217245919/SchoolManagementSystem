package za.ac.cput.school_management.service.lookup;

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.service.IService;
import java.util.List;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameService.java
*/

public interface NameService extends IService<Name, String> {

    List<Name> getAll();
}