/* DO NOT EDIT | Generated by dbgenerator */

import RealmSwift

final class Dog: Object {

    enum Attributes: String {
        case Age = "age"
        case Name = "name"
    }

    dynamic var age: Int16 = 0
    dynamic var name: String = ""

    let owner: Person = LinkingObjects(fromType: Person.self, property: "dogs")

}
