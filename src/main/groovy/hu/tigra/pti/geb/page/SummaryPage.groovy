package hu.tigra.pti.geb.page

import geb.Page

class SummaryPage extends Page {

    static url = "/index.php?fc=module&module=cheque&controller=payment"

    static at = { header.displayed }

    static content = {

        header { $('h1.page-heading') }
        confirmButton  { $('button.button.btn.btn-default.button-medium') }
        successMessage(required: false)  { $('p.alert.alert-success') }

    }
}
