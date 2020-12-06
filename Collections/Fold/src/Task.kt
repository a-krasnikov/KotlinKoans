// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
        customers.flatMap { customer ->
            customer.getOrderedProducts()
        }.fold(HashSet()) { set, product ->
            set.add(product)
            return set
        }


fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)