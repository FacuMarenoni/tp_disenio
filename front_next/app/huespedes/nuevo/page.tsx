import { Suspense } from 'react';
import FormularioHuesped from '@/components/FormularioHuesped';

export default function NuevoHuespedPage() {
    return (
        <Suspense fallback={<div>Cargando...</div>}>
            <FormularioHuesped />
        </Suspense>
    );
}
