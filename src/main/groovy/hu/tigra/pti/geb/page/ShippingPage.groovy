package hu.tigra.pti.geb.page

import geb.Page
import geb.module.Checkbox

class ShippingPage extends Page {

    static url = "/index.php?controller=order"

    static at = { header.displayed }

    static content = {

        header { $('h1.page-heading') }
        checkbox { $('#cgv').module(Checkbox)}
        checkoutButton { $('button[name="processCarrier"]')}

    }
}
