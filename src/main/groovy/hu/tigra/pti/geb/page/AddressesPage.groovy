package hu.tigra.pti.geb.page

import geb.Page

class AddressesPage extends Page {

    static url = "/index.php?controller=order&step=1"

    static at = { header.displayed }

    static content = {

        header { $('h1.page-heading') }
        checkoutButton { $('button[name="processAddress"]') }

    }
}
