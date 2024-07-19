import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.ProductsItem
import com.example.routeandroidtask.databinding.ItemLayoutBinding

class ProductsAdapter(private var productsList : List<ProductsItem?>?= null) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>()  {
    class ViewHolder(val itemBinding : ItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bindData(productsItem: ProductsItem?) {
            itemBinding.product=productsItem
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(itemBinding)
    }
    override fun getItemCount(): Int = productsList?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindData(productsList!![position])
        bindPriceBeforeDiscount(holder, position)

    }

    private fun bindPriceBeforeDiscount(holder: ViewHolder, position: Int) {
        val discountPercent = productsList?.get(position)?.discountPercentage ?: 0.0
        val price = productsList?.get(position)?.price ?: 0.0
        val priceBeforeDiscount = price + (discountPercent * price/100)
        val formattedPriceBeforeDiscount = String.format("%.2f", priceBeforeDiscount)

        holder.itemBinding.priceBefore.apply {
            text = "$formattedPriceBeforeDiscount EGP"
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
    }

    fun bindProductsList(productsList: List<ProductsItem?>?) {
        this.productsList = productsList

        notifyDataSetChanged()
    }

}