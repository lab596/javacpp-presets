// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


@Name("ngraph::runtime::BackendManager") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class BackendManager extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BackendManager() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BackendManager(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackendManager(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BackendManager position(long position) {
        return (BackendManager)super.position(position);
    }
    @Override public BackendManager getPointer(long i) {
        return new BackendManager((Pointer)this).offsetAddress(i);
    }

    /** \brief Used by build-in backends to register their name and constructor.
     *     This function is not used if the backend is build as a shared library.
     *  @param name The name of the registering backend in UPPER CASE.
     *  @param backend_constructor A BackendConstructor which will be called to
    ////     construct an instance of the registered backend. */
    public static native void register_backend(@StdString BytePointer name, BackendConstructor backend_constructor);
    public static native void register_backend(@StdString String name, BackendConstructor backend_constructor);

    /** \brief Query the list of registered devices
     *  @return A vector of all registered devices. */
    public static native @ByVal StringVector get_registered_backends();
}
