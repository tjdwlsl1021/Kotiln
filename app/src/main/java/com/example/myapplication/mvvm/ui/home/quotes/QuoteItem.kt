package com.example.myapplication.mvvm.ui.home.quotes

import com.example.myapplication.R
import com.example.myapplication.databinding.ItemQuoteBinding
import com.example.myapplication.mvvm.data.db.entities.Quote
import com.xwray.groupie.databinding.BindableItem

class QuoteItem(
    private val quoto: Quote
) : BindableItem<ItemQuoteBinding>() {

    override fun getLayout() = R.layout.item_quote

    override fun bind(viewBinding: ItemQuoteBinding, position: Int) {
        viewBinding.setQuote(quoto)
    }

}