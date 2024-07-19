package com.example.routeandroidtask.databinding;
import com.example.routeandroidtask.R;
import com.example.routeandroidtask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLayoutBindingImpl extends ItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_favorite, 6);
        sViewsWithIds.put(R.id.price_before, 7);
        sViewsWithIds.put(R.id.add, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.brandName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.priceAfter.setTag(null);
        this.productImg.setTag(null);
        this.productName.setTag(null);
        this.rating.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.example.domain.model.ProductsItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.example.domain.model.ProductsItem Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String productTitle = null;
        java.util.List<java.lang.String> productImages = null;
        java.lang.String productBrand = null;
        com.example.domain.model.ProductsItem product = mProduct;
        java.lang.Double productPrice = null;
        java.lang.Float productRating = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.images
                    productImages = product.getImages();
                    // read product.brand
                    productBrand = product.getBrand();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.rating
                    productRating = product.getRating();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.brandName, productTitle);
            com.example.routeandroidtask.BindAdapterKt.setFormattedPrice(this.priceAfter, productPrice);
            com.example.routeandroidtask.BindAdapterKt.bindSrcImage(this.productImg, productImages);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productName, productBrand);
            com.example.routeandroidtask.BindAdapterKt.setFormattedRating(this.rating, productRating);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}