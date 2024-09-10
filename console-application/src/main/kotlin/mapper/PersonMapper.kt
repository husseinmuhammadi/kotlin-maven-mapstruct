package mapper

import model.Employee
import model.Person
import org.mapstruct.Mapper

@Mapper
interface PersonMapper {
    fun map(person: Person): Employee
}