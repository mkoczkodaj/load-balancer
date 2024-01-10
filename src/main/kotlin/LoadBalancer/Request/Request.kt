package LoadBalancer.Request

class Request(val obj: Any?, val type: Type) {
    enum class Type {
        SELECT,
        INSERT,
        DELETE,
        UPDATE
    }
}