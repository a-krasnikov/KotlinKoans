fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()

            for (i in products.indices) {
                tr {
                    td (color = getCellColor(i, 0)){
                        text(products[i].description)
                    }
                    td (color = getCellColor(i, 1)){
                        text(products[i].price)
                    }
                    td (color = getCellColor(i, 2)){
                        text(products[i].popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
