
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.domain.model.ProductsItem;
import com.example.routeandroidtask.databinding.ItemLayoutBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0019\u0012\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\b2\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"LProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LProductsAdapter$ViewHolder;", "productsList", "", "Lcom/example/domain/model/ProductsItem;", "(Ljava/util/List;)V", "bindPriceBeforeDiscount", "", "holder", "position", "", "bindProductsList", "getItemCount", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ProductsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ProductsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.domain.model.ProductsItem> productsList;
    
    public ProductsAdapter(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.domain.model.ProductsItem> productsList) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public ProductsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    ProductsAdapter.ViewHolder holder, int position) {
    }
    
    private final void bindPriceBeforeDiscount(ProductsAdapter.ViewHolder holder, int position) {
    }
    
    public final void bindProductsList(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.domain.model.ProductsItem> productsList) {
    }
    
    public ProductsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"LProductsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/routeandroidtask/databinding/ItemLayoutBinding;", "(Lcom/example/routeandroidtask/databinding/ItemLayoutBinding;)V", "getItemBinding", "()Lcom/example/routeandroidtask/databinding/ItemLayoutBinding;", "bindData", "", "productsItem", "Lcom/example/domain/model/ProductsItem;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.routeandroidtask.databinding.ItemLayoutBinding itemBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.routeandroidtask.databinding.ItemLayoutBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.routeandroidtask.databinding.ItemLayoutBinding getItemBinding() {
            return null;
        }
        
        public final void bindData(@org.jetbrains.annotations.Nullable
        com.example.domain.model.ProductsItem productsItem) {
        }
    }
}