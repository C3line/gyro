/* DO NOT EDIT | Generated by dbgenerator */

import RealmSwift

final class FidelityCard: Object {

    enum Attributes: String {
        case Identifier = "identifier"
        case Points = "points"
    }

    enum Relationships: String {
        case User = "user"
    }

    dynamic var identifier: Int16 = 0
    let points = RealmOptional<Int32>()
    dynamic var user: User?

}
