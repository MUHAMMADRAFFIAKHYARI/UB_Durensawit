package android.example.ub_durensawit.DbConn.local;

import android.example.ub_durensawit.Model.Cart;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;


public interface CartDao {
    @Query("SELECT * FROM Cart")
    Flowable<List<Cart>> getCartItems();

    @Query("SELECT * FROM Cart Where id =:cartItemId")
    Flowable<List<Cart>> GetCartItemById(int cartItemId);

    @Query("SELECT COUNT(*) FROM Cart")
    int countCartItems();

    @Query("DELETE FROM Cart")
    void emptyCart();

    @Insert
    void InsertToCart(Cart...carts);

    @Update
    void UpdateCart(Cart...carts);

    @Delete
    void deleteCartItem(Cart cart);



}