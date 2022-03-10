package com.tech.world

import io.reactivex.disposables.CompositeDisposable

interface Base {
    val disposables:CompositeDisposable
}