/**
 *
 * $Id$
 */
package ddsm.validation;

import ddsm.ProvidedExecutionPlatform;
import ddsm.RequiredExecutionPlatform;

/**
 * A sample validator interface for {@link ddsm.ExecutionBinding}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExecutionBindingValidator {
    boolean validate();

    boolean validateRequiredexecutionplatform(RequiredExecutionPlatform value);
    boolean validateProvidedexecutionplatform(ProvidedExecutionPlatform value);
}
