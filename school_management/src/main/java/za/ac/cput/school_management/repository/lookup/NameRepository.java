package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.lookup.Name;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameRepository.java
*/

@Repository
public interface NameRepository extends JpaRepository <Name, String> {

}

