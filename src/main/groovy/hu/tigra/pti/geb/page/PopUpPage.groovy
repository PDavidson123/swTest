package hu.tigra.pti.geb.page

import geb.Page

class PopUpPage extends Page {

    static url = "/index.php"

    static at = { popup.displayed }

    static content = {
        popup { $('#layer_cart') }
        productMsg { popup.$('.layer_cart_product.col-xs-12.col-md-6').$('h2') }
        checkoutButton { popup.$('.btn.btn-default.button.button-medium') }

    }
}
