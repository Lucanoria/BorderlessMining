package link.infra.dxjni;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;

public class D3D12CommandQueue extends D3D12DeviceChild {
	public static final Guid.IID IID_ID3D12CommandQueue = new Guid.IID("{0ec870a6-5d7e-4c22-8cfc-5baae07616ed}");

	public D3D12CommandQueue(Pointer ptr) {
		super(ptr);
	}

	public D3D12CommandQueue() {
		super();
	}

	public void ExecuteCommandLists(D3D12GraphicsCommandList[] ppCommandLists) {
		_invokeNativeObject(10, new Object[]{this.getPointer(), new WinDef.UINT(ppCommandLists.length), ppCommandLists}, void.class);
	}

	public WinNT.HRESULT Signal(D3D12Fence fence, long fenceValue) {
		return (WinNT.HRESULT) _invokeNativeObject(14, new Object[]{this.getPointer(), fence, fenceValue}, WinNT.HRESULT.class);
	}

	public WinNT.HRESULT Wait(D3D12Fence fence, long fenceValue) {
		return (WinNT.HRESULT) _invokeNativeObject(15, new Object[]{this.getPointer(), fence, fenceValue}, WinNT.HRESULT.class);
	}
}
