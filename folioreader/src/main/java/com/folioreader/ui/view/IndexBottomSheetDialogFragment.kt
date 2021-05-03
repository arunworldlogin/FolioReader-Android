package com.folioreader.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.folioreader.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class IndexBottomSheetDialogFragment: BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.index_bottom_sheet_layout,container,false)
    }
}